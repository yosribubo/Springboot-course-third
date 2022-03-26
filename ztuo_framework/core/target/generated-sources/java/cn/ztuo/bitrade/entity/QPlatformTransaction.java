package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPlatformTransaction is a Querydsl query type for PlatformTransaction
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPlatformTransaction extends EntityPathBase<PlatformTransaction> {

    private static final long serialVersionUID = 864283432L;

    public static final QPlatformTransaction platformTransaction = new QPlatformTransaction("platformTransaction");

    public final NumberPath<java.math.BigDecimal> amount = createNumber("amount", java.math.BigDecimal.class);

    public final StringPath bizOrderId = createString("bizOrderId");

    public final StringPath day = createString("day");

    public final NumberPath<Integer> direction = createNumber("direction", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.util.Date> time = createDateTime("time", java.util.Date.class);

    public final NumberPath<Integer> type = createNumber("type", Integer.class);

    public QPlatformTransaction(String variable) {
        super(PlatformTransaction.class, forVariable(variable));
    }

    public QPlatformTransaction(Path<? extends PlatformTransaction> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPlatformTransaction(PathMetadata metadata) {
        super(PlatformTransaction.class, metadata);
    }

}

