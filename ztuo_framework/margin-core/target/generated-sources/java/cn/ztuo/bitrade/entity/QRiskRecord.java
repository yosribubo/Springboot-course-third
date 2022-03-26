package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRiskRecord is a Querydsl query type for RiskRecord
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRiskRecord extends EntityPathBase<RiskRecord> {

    private static final long serialVersionUID = 1763878051L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRiskRecord riskRecord = new QRiskRecord("riskRecord");

    public final DateTimePath<java.util.Date> createTime = createDateTime("createTime", java.util.Date.class);

    public final NumberPath<java.math.BigDecimal> currentThreshold = createNumber("currentThreshold", java.math.BigDecimal.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QLeverCoin leverCoin;

    public final QLossThreshold lossThreshold;

    public final NumberPath<Long> memberId = createNumber("memberId", Long.class);

    public final StringPath memberName = createString("memberName");

    public final EnumPath<cn.ztuo.bitrade.enums.PerformActionsEnum> performActions = createEnum("performActions", cn.ztuo.bitrade.enums.PerformActionsEnum.class);

    public QRiskRecord(String variable) {
        this(RiskRecord.class, forVariable(variable), INITS);
    }

    public QRiskRecord(Path<? extends RiskRecord> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRiskRecord(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRiskRecord(PathMetadata metadata, PathInits inits) {
        this(RiskRecord.class, metadata, inits);
    }

    public QRiskRecord(Class<? extends RiskRecord> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.leverCoin = inits.isInitialized("leverCoin") ? new QLeverCoin(forProperty("leverCoin")) : null;
        this.lossThreshold = inits.isInitialized("lossThreshold") ? new QLossThreshold(forProperty("lossThreshold"), inits.get("lossThreshold")) : null;
    }

}

