package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLeverWallet is a Querydsl query type for LeverWallet
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QLeverWallet extends EntityPathBase<LeverWallet> {

    private static final long serialVersionUID = 1056712672L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QLeverWallet leverWallet = new QLeverWallet("leverWallet");

    public final NumberPath<java.math.BigDecimal> balance = createNumber("balance", java.math.BigDecimal.class);

    public final QCoin coin;

    public final StringPath email = createString("email");

    public final NumberPath<java.math.BigDecimal> frozenBalance = createNumber("frozenBalance", java.math.BigDecimal.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final EnumPath<cn.ztuo.bitrade.constant.BooleanEnum> isLock = createEnum("isLock", cn.ztuo.bitrade.constant.BooleanEnum.class);

    public final QLeverCoin leverCoin;

    public final NumberPath<Long> memberId = createNumber("memberId", Long.class);

    public final StringPath memberName = createString("memberName");

    public final StringPath mobilePhone = createString("mobilePhone");

    public final EnumPath<cn.ztuo.bitrade.enums.WalletEnum> status = createEnum("status", cn.ztuo.bitrade.enums.WalletEnum.class);

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public QLeverWallet(String variable) {
        this(LeverWallet.class, forVariable(variable), INITS);
    }

    public QLeverWallet(Path<? extends LeverWallet> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QLeverWallet(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QLeverWallet(PathMetadata metadata, PathInits inits) {
        this(LeverWallet.class, metadata, inits);
    }

    public QLeverWallet(Class<? extends LeverWallet> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.coin = inits.isInitialized("coin") ? new QCoin(forProperty("coin")) : null;
        this.leverCoin = inits.isInitialized("leverCoin") ? new QLeverCoin(forProperty("leverCoin")) : null;
    }

}

