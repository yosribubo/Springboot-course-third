package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLossThreshold is a Querydsl query type for LossThreshold
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QLossThreshold extends EntityPathBase<LossThreshold> {

    private static final long serialVersionUID = 1484993797L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QLossThreshold lossThreshold = new QLossThreshold("lossThreshold");

    public final DateTimePath<java.util.Date> createTime = createDateTime("createTime", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QLeverCoin leverCoin;

    public final EnumPath<cn.ztuo.bitrade.enums.PerformActionsEnum> performActions = createEnum("performActions", cn.ztuo.bitrade.enums.PerformActionsEnum.class);

    public final EnumPath<cn.ztuo.bitrade.constant.CommonStatus> status = createEnum("status", cn.ztuo.bitrade.constant.CommonStatus.class);

    public final NumberPath<java.math.BigDecimal> threshold = createNumber("threshold", java.math.BigDecimal.class);

    public final DateTimePath<java.util.Date> updateTime = createDateTime("updateTime", java.util.Date.class);

    public QLossThreshold(String variable) {
        this(LossThreshold.class, forVariable(variable), INITS);
    }

    public QLossThreshold(Path<? extends LossThreshold> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QLossThreshold(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QLossThreshold(PathMetadata metadata, PathInits inits) {
        this(LossThreshold.class, metadata, inits);
    }

    public QLossThreshold(Class<? extends LossThreshold> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.leverCoin = inits.isInitialized("leverCoin") ? new QLeverCoin(forProperty("leverCoin")) : null;
    }

}

