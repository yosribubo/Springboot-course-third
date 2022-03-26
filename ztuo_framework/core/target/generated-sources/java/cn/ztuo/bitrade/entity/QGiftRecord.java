package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QGiftRecord is a Querydsl query type for GiftRecord
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QGiftRecord extends EntityPathBase<GiftRecord> {

    private static final long serialVersionUID = 2141427268L;

    public static final QGiftRecord giftRecord = new QGiftRecord("giftRecord");

    public final DateTimePath<java.util.Date> createTime = createDateTime("createTime", java.util.Date.class);

    public final NumberPath<java.math.BigDecimal> giftAmount = createNumber("giftAmount", java.math.BigDecimal.class);

    public final StringPath giftCoin = createString("giftCoin");

    public final StringPath giftName = createString("giftName");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> userId = createNumber("userId", Long.class);

    public final StringPath userMobile = createString("userMobile");

    public final StringPath userName = createString("userName");

    public QGiftRecord(String variable) {
        super(GiftRecord.class, forVariable(variable));
    }

    public QGiftRecord(Path<? extends GiftRecord> path) {
        super(path.getType(), path.getMetadata());
    }

    public QGiftRecord(PathMetadata metadata) {
        super(GiftRecord.class, metadata);
    }

}

