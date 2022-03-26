package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QIeoEmption is a Querydsl query type for IeoEmption
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QIeoEmption extends EntityPathBase<IeoEmption> {

    private static final long serialVersionUID = 914353708L;

    public static final QIeoEmption ieoEmption = new QIeoEmption("ieoEmption");

    public final DateTimePath<java.util.Date> createTime = createDateTime("createTime", java.util.Date.class);

    public final StringPath createUser = createString("createUser");

    public final DateTimePath<java.util.Date> endTime = createDateTime("endTime", java.util.Date.class);

    public final DateTimePath<java.util.Date> expectTime = createDateTime("expectTime", java.util.Date.class);

    public final NumberPath<java.math.BigDecimal> fee = createNumber("fee", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> haveAmount = createNumber("haveAmount", java.math.BigDecimal.class);

    public final StringPath haveCoin = createString("haveCoin");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath ieoName = createString("ieoName");

    public final NumberPath<java.math.BigDecimal> limitAmount = createNumber("limitAmount", java.math.BigDecimal.class);

    public final StringPath pic = createString("pic");

    public final StringPath picView = createString("picView");

    public final StringPath raiseCoin = createString("raiseCoin");

    public final NumberPath<java.math.BigDecimal> ratio = createNumber("ratio", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> saleAmount = createNumber("saleAmount", java.math.BigDecimal.class);

    public final StringPath saleCoin = createString("saleCoin");

    public final StringPath sellDetail = createString("sellDetail");

    public final StringPath sellMode = createString("sellMode");

    public final DateTimePath<java.util.Date> startTime = createDateTime("startTime", java.util.Date.class);

    public final NumberPath<java.math.BigDecimal> successRatio = createNumber("successRatio", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> surplusAmount = createNumber("surplusAmount", java.math.BigDecimal.class);

    public final DateTimePath<java.util.Date> updateTime = createDateTime("updateTime", java.util.Date.class);

    public final StringPath updateUser = createString("updateUser");

    public QIeoEmption(String variable) {
        super(IeoEmption.class, forVariable(variable));
    }

    public QIeoEmption(Path<? extends IeoEmption> path) {
        super(path.getType(), path.getMetadata());
    }

    public QIeoEmption(PathMetadata metadata) {
        super(IeoEmption.class, metadata);
    }

}

