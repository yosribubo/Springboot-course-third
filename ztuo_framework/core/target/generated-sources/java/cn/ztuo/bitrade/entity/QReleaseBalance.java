package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QReleaseBalance is a Querydsl query type for ReleaseBalance
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QReleaseBalance extends EntityPathBase<ReleaseBalance> {

    private static final long serialVersionUID = 2111277048L;

    public static final QReleaseBalance releaseBalance1 = new QReleaseBalance("releaseBalance1");

    public final StringPath coinName = createString("coinName");

    public final StringPath coinUnit = createString("coinUnit");

    public final StringPath email = createString("email");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> memberId = createNumber("memberId", Long.class);

    public final StringPath phone = createString("phone");

    public final DateTimePath<java.util.Date> registerTime = createDateTime("registerTime", java.util.Date.class);

    public final NumberPath<java.math.BigDecimal> releaseBalance = createNumber("releaseBalance", java.math.BigDecimal.class);

    public final StringPath releaseState = createString("releaseState");

    public final DateTimePath<java.util.Date> releaseTime = createDateTime("releaseTime", java.util.Date.class);

    public final StringPath userName = createString("userName");

    public QReleaseBalance(String variable) {
        super(ReleaseBalance.class, forVariable(variable));
    }

    public QReleaseBalance(Path<? extends ReleaseBalance> path) {
        super(path.getType(), path.getMetadata());
    }

    public QReleaseBalance(PathMetadata metadata) {
        super(ReleaseBalance.class, metadata);
    }

}

