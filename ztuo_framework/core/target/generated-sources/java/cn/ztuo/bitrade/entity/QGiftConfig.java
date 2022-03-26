package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QGiftConfig is a Querydsl query type for GiftConfig
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QGiftConfig extends EntityPathBase<GiftConfig> {

    private static final long serialVersionUID = 1721543989L;

    public static final QGiftConfig giftConfig = new QGiftConfig("giftConfig");

    public final NumberPath<java.math.BigDecimal> amount = createNumber("amount", java.math.BigDecimal.class);

    public final DateTimePath<java.util.Date> createTime = createDateTime("createTime", java.util.Date.class);

    public final StringPath giftCoin = createString("giftCoin");

    public final StringPath giftName = createString("giftName");

    public final NumberPath<java.math.BigDecimal> haveAmount = createNumber("haveAmount", java.math.BigDecimal.class);

    public final StringPath haveCoin = createString("haveCoin");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QGiftConfig(String variable) {
        super(GiftConfig.class, forVariable(variable));
    }

    public QGiftConfig(Path<? extends GiftConfig> path) {
        super(path.getType(), path.getMetadata());
    }

    public QGiftConfig(PathMetadata metadata) {
        super(GiftConfig.class, metadata);
    }

}

