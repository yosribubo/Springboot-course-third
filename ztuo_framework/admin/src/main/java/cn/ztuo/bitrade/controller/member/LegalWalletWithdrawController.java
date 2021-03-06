package cn.ztuo.bitrade.controller.member;

import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.BooleanExpression;
import cn.ztuo.bitrade.constant.PageModel;
import cn.ztuo.bitrade.constant.TransactionType;
import cn.ztuo.bitrade.constant.WithdrawStatus;
import cn.ztuo.bitrade.controller.common.BaseAdminController;
import cn.ztuo.bitrade.entity.MemberTransaction;
import cn.ztuo.bitrade.model.screen.LegalWalletWithdrawScreen;
import cn.ztuo.bitrade.entity.LegalWalletWithdraw;
import cn.ztuo.bitrade.entity.MemberWallet;
import cn.ztuo.bitrade.entity.QLegalWalletWithdraw;
import cn.ztuo.bitrade.service.LegalWalletWithdrawService;
import cn.ztuo.bitrade.service.MemberTransactionService;
import cn.ztuo.bitrade.service.MemberWalletService;
import cn.ztuo.bitrade.util.MessageResult;
import cn.ztuo.bitrade.util.PredicateUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;

@RestController
@RequestMapping("legal-wallet-withdraw")
public class LegalWalletWithdrawController extends BaseAdminController {
    @Autowired
    private LegalWalletWithdrawService legalWalletWithdrawService;

    @Autowired
    private MemberWalletService walletService;

    @Autowired
    private MemberTransactionService memberTransactionService ;

    @GetMapping("page")
    public MessageResult page(
            PageModel pageModel,
            LegalWalletWithdrawScreen screen) {
        Predicate predicate = getPredicate(screen);
        Page<LegalWalletWithdraw> page = legalWalletWithdrawService.findAll(predicate, pageModel);
        return success(page);
    }

    @GetMapping("{id}")
    public MessageResult detail(@PathVariable("id") Long id) {
        LegalWalletWithdraw one = legalWalletWithdrawService.findOne(id);
        Assert.notNull(one, "validate id!");
        return success(one);
    }

    //????????????
    @PatchMapping("{id}/pass")
    @Transactional(rollbackFor = Exception.class)
    public MessageResult pass(@PathVariable("id") Long id) {
        // ????????????
        LegalWalletWithdraw one = legalWalletWithdrawService.findOne(id);

        MemberTransaction memberTransaction = new MemberTransaction() ;
        memberTransaction.setAmount(one.getAmount());
        memberTransaction.setAddress("");
        memberTransaction.setMemberId(one.getMember().getId());
        memberTransaction.setFee(BigDecimal.ZERO);
        memberTransaction.setSymbol(one.getCoin().getUnit());
        memberTransaction.setType(TransactionType.WITHDRAW);
        memberTransactionService.save(memberTransaction);
        Assert.notNull(one, "validate id!");
        Assert.isTrue(one.getStatus() == WithdrawStatus.PROCESSING, "???????????????!");
        //????????????
        legalWalletWithdrawService.pass(one);
        return success();
    }

    //???????????????
    @PatchMapping("{id}/no-pass")
    public MessageResult noPass(@PathVariable("id") Long id) {
        //?????? ??????
        LegalWalletWithdraw one = legalWalletWithdrawService.findOne(id);
        Assert.notNull(one, "validate id!");
        Assert.isTrue(one.getStatus() == WithdrawStatus.PROCESSING, "???????????????!");
        //????????????
        MemberWallet wallet = walletService.findByCoinAndMember(one.getCoin(), one.getMember());
        Assert.notNull(wallet, "wallet null!");
        //????????? ???????????? ???????????????
        legalWalletWithdrawService.noPass(wallet, one);
        return success(one);
    }

    //???????????? ?????????????????????
    @PatchMapping("{id}/remit")
    public MessageResult remit(
            @PathVariable("id") Long id,
            @RequestParam("paymentInstrument") String paymentInstrument) {
        //???????????????
        LegalWalletWithdraw one = legalWalletWithdrawService.findOne(id);
        Assert.notNull(one, "validate id!");
        Assert.isTrue(one.getStatus() == WithdrawStatus.WAITING, "???????????????!");
        //????????????
        MemberWallet wallet = walletService.findByCoinAndMember(one.getCoin(), one.getMember());
        Assert.notNull(wallet, "wallet null!");
        //????????????
        legalWalletWithdrawService.remit(paymentInstrument, one, wallet);
        return success(one);
    }


    //??????
    private Predicate getPredicate(LegalWalletWithdrawScreen screen) {
        ArrayList<BooleanExpression> booleanExpressions = new ArrayList<>();
        if (StringUtils.isNotBlank(screen.getUsername()))
            booleanExpressions.add(QLegalWalletWithdraw.legalWalletWithdraw.member.username.eq(screen.getUsername()));
        if (screen.getStatus() != null)
            booleanExpressions.add(QLegalWalletWithdraw.legalWalletWithdraw.status.eq(screen.getStatus()));
        if (StringUtils.isNotBlank(screen.getCoinName()))
            booleanExpressions.add(QLegalWalletWithdraw.legalWalletWithdraw.coin.name.eq(screen.getCoinName()));
        return PredicateUtils.getPredicate(booleanExpressions);
    }
}
