package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QEmptionRecord is a Querydsl query type for EmptionRecord
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEmptionRecord extends EntityPathBase<EmptionRecord> {

    private static final long serialVersionUID = 85908426L;

    public static final QEmptionRecord emptionRecord = new QEmptionRecord("emptionRecord");

    public final DateTimePath<java.util.Date> createTime = createDateTime("createTime", java.util.Date.class);

    public final DateTimePath<java.util.Date> endTime = createDateTime("endTime", java.util.Date.class);

    public final DateTimePath<java.util.Date> expectTime = createDateTime("expectTime", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> ieoId = createNumber("ieoId", Long.class);

    public final StringPath ieoName = createString("ieoName");

    public final NumberPath<java.math.BigDecimal> payAmount = createNumber("payAmount", java.math.BigDecimal.class);

    public final StringPath picView = createString("picView");

    public final StringPath raiseCoin = createString("raiseCoin");

    public final NumberPath<java.math.BigDecimal> ratio = createNumber("ratio", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> receiveAmount = createNumber("receiveAmount", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> saleAmount = createNumber("saleAmount", java.math.BigDecimal.class);

    public final StringPath saleCoin = createString("saleCoin");

    public final DateTimePath<java.util.Date> startTime = createDateTime("startTime", java.util.Date.class);

    public final StringPath status = createString("status");

    public final NumberPath<Long> userId = createNumber("userId", Long.class);

    public final StringPath userMobile = createString("userMobile");

    public final StringPath userName = createString("userName");

    public QEmptionRecord(String variable) {
        super(EmptionRecord.class, forVariable(variable));
    }

    public QEmptionRecord(Path<? extends EmptionRecord> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEmptionRecord(PathMetadata metadata) {
        super(EmptionRecord.class, metadata);
    }

}

