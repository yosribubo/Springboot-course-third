package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QRewardWallet is a Querydsl query type for RewardWallet
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRewardWallet extends EntityPathBase<RewardWallet> {

    private static final long serialVersionUID = 267389931L;

    public static final QRewardWallet rewardWallet = new QRewardWallet("rewardWallet");

    public final NumberPath<java.math.BigDecimal> balance = createNumber("balance", java.math.BigDecimal.class);

    public final StringPath coinUnit = createString("coinUnit");

    public final NumberPath<java.math.BigDecimal> frozenBalance = createNumber("frozenBalance", java.math.BigDecimal.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final EnumPath<cn.ztuo.bitrade.constant.BooleanEnum> isLock = createEnum("isLock", cn.ztuo.bitrade.constant.BooleanEnum.class);

    public final NumberPath<Long> memberId = createNumber("memberId", Long.class);

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public QRewardWallet(String variable) {
        super(RewardWallet.class, forVariable(variable));
    }

    public QRewardWallet(Path<? extends RewardWallet> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRewardWallet(PathMetadata metadata) {
        super(RewardWallet.class, metadata);
    }

}

