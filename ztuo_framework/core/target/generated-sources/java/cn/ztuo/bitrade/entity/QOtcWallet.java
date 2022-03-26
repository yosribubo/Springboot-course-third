package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOtcWallet is a Querydsl query type for OtcWallet
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QOtcWallet extends EntityPathBase<OtcWallet> {

    private static final long serialVersionUID = 1578764212L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOtcWallet otcWallet = new QOtcWallet("otcWallet");

    public final NumberPath<java.math.BigDecimal> balance = createNumber("balance", java.math.BigDecimal.class);

    public final QCoin coin;

    public final NumberPath<java.math.BigDecimal> frozenBalance = createNumber("frozenBalance", java.math.BigDecimal.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> isLock = createNumber("isLock", Integer.class);

    public final NumberPath<Long> memberId = createNumber("memberId", Long.class);

    public final NumberPath<java.math.BigDecimal> releaseBalance = createNumber("releaseBalance", java.math.BigDecimal.class);

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public QOtcWallet(String variable) {
        this(OtcWallet.class, forVariable(variable), INITS);
    }

    public QOtcWallet(Path<? extends OtcWallet> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOtcWallet(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOtcWallet(PathMetadata metadata, PathInits inits) {
        this(OtcWallet.class, metadata, inits);
    }

    public QOtcWallet(Class<? extends OtcWallet> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.coin = inits.isInitialized("coin") ? new QCoin(forProperty("coin")) : null;
    }

}

