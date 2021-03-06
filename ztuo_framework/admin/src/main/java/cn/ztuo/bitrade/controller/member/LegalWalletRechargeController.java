package cn.ztuo.bitrade.controller.member;

import cn.ztuo.bitrade.controller.common.BaseAdminController;
import cn.ztuo.bitrade.model.screen.LegalWalletRechargeScreen;
import com.mysema.commons.lang.Assert;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.BooleanExpression;
import cn.ztuo.bitrade.constant.LegalWalletState;
import cn.ztuo.bitrade.constant.PageModel;
import cn.ztuo.bitrade.constant.TransactionType;
import cn.ztuo.bitrade.controller.common.BaseAdminController;
import cn.ztuo.bitrade.entity.MemberTransaction;
import cn.ztuo.bitrade.model.screen.LegalWalletRechargeScreen;
import cn.ztuo.bitrade.entity.LegalWalletRecharge;
import cn.ztuo.bitrade.entity.MemberWallet;
import cn.ztuo.bitrade.entity.QLegalWalletRecharge;
import cn.ztuo.bitrade.service.LegalWalletRechargeService;
import cn.ztuo.bitrade.service.MemberTransactionService;
import cn.ztuo.bitrade.service.MemberWalletService;
import cn.ztuo.bitrade.util.MessageResult;
import cn.ztuo.bitrade.util.PredicateUtils;
import cn.ztuo.bitrade.controller.common.BaseAdminController;
import cn.ztuo.bitrade.model.screen.LegalWalletRechargeScreen;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * MrGao
 */
@RestController
@RequestMapping("legal-wallet-recharge")
public class LegalWalletRechargeController extends BaseAdminController {
    @Autowired
    private LegalWalletRechargeService legalWalletRechargeService;
    @Autowired
    private MemberWalletService walletService;

    @Autowired
    private MemberTransactionService memberTransactionService ;

    @GetMapping("page")
    public MessageResult page(
            PageModel pageModel,
            LegalWalletRechargeScreen screen) {
        Predicate predicate = getPredicate(screen);
        Page<LegalWalletRecharge> page = legalWalletRechargeService.findAll(predicate, pageModel);
        return success(page);
    }

    @GetMapping("{id}")
    public MessageResult id(@PathVariable("id") Long id) {
        LegalWalletRecharge legalWalletRecharge = legalWalletRechargeService.findOne(id);
        Assert.notNull(legalWalletRecharge, "validate id!");
        return success(legalWalletRecharge);
    }

    //????????????
    @PatchMapping("{id}/pass")
    @Transactional(rollbackFor = Exception.class)
    public MessageResult pass(@PathVariable("id") Long id) {
        //????????????
        LegalWalletRecharge legalWalletRecharge = legalWalletRechargeService.findOne(id);
        MemberTransaction memberTransaction = new MemberTransaction() ;
        memberTransaction.setAmount(legalWalletRecharge.getAmount());
        memberTransaction.setAddress("");
        memberTransaction.setMemberId(legalWalletRecharge.getMember().getId());
        memberTransaction.setFee(BigDecimal.ZERO);
        memberTransaction.setSymbol(legalWalletRecharge.getCoin().getUnit());
        memberTransaction.setType(TransactionType.LEGAL_RECHARGE);
        memberTransactionService.save(memberTransaction);

        Assert.notNull(legalWalletRecharge, "validate id!");
        Assert.isTrue(legalWalletRecharge.getState() == LegalWalletState.APPLYING, "??????????????????!");
        //????????????
        MemberWallet wallet = walletService.findByCoinAndMember(legalWalletRecharge.getCoin(), legalWalletRecharge.getMember());
        org.springframework.util.Assert.notNull(wallet, "wallet null!");
        //????????????????????????
        legalWalletRechargeService.pass(wallet, legalWalletRecharge);
        return success();
    }

    //????????????
    @PatchMapping("{id}/no-pass")
    public MessageResult noPass(@PathVariable("id") Long id) {
        LegalWalletRecharge legalWalletRecharge = legalWalletRechargeService.findOne(id);
        Assert.notNull(legalWalletRecharge, "validate id!");
        Assert.isTrue(legalWalletRecharge.getState() == LegalWalletState.APPLYING, "??????????????????!");
        legalWalletRechargeService.noPass(legalWalletRecharge);
        return success();
    }

    //??????
    private Predicate getPredicate(LegalWalletRechargeScreen screen) {
        ArrayList<BooleanExpression> booleanExpressions = new ArrayList<>();
        if (StringUtils.isNotBlank(screen.getUsername()))
            booleanExpressions.add(QLegalWalletRecharge.legalWalletRecharge.member.username.eq(screen.getUsername()));
        if (screen.getStatus() != null)
            booleanExpressions.add(QLegalWalletRecharge.legalWalletRecharge.state.eq(screen.getStatus()));
        if (StringUtils.isNotBlank(screen.getCoinName()))
            booleanExpressions.add(QLegalWalletRecharge.legalWalletRecharge.coin.name.eq(screen.getCoinName()));
        return PredicateUtils.getPredicate(booleanExpressions);
    }
}
