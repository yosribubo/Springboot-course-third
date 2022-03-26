package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLockPositionRecord is a Querydsl query type for LockPositionRecord
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QLockPositionRecord extends EntityPathBase<LockPositionRecord> {

    private static final long serialVersionUID = 1166573192L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QLockPositionRecord lockPositionRecord = new QLockPositionRecord("lockPositionRecord");

    public final NumberPath<java.math.BigDecimal> amount = createNumber("amount", java.math.BigDecimal.class);

    public final QCoin coin;

    public final DateTimePath<java.util.Date> createTime = createDateTime("createTime", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> memberId = createNumber("memberId", Long.class);

    public final StringPath memberName = createString("memberName");

    public final StringPath reason = createString("reason");

    public final EnumPath<cn.ztuo.bitrade.constant.CommonStatus> status = createEnum("status", cn.ztuo.bitrade.constant.CommonStatus.class);

    public final DateTimePath<java.util.Date> unlockTime = createDateTime("unlockTime", java.util.Date.class);

    public final NumberPath<Long> walletId = createNumber("walletId", Long.class);

    public QLockPositionRecord(String variable) {
        this(LockPositionRecord.class, forVariable(variable), INITS);
    }

    public QLockPositionRecord(Path<? extends LockPositionRecord> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QLockPositionRecord(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QLockPositionRecord(PathMetadata metadata, PathInits inits) {
        this(LockPositionRecord.class, metadata, inits);
    }

    public QLockPositionRecord(Class<? extends LockPositionRecord> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.coin = inits.isInitialized("coin") ? new QCoin(forProperty("coin")) : null;
    }

}

