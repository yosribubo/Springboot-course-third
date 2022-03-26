package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPoundageConvertEth is a Querydsl query type for PoundageConvertEth
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPoundageConvertEth extends EntityPathBase<PoundageConvertEth> {

    private static final long serialVersionUID = 1139653596L;

    public static final QPoundageConvertEth poundageConvertEth = new QPoundageConvertEth("poundageConvertEth");

    public final StringPath coinId = createString("coinId");

    public final StringPath direction = createString("direction");

    public final StringPath ethUsdtRate = createString("ethUsdtRate");

    public final StringPath exchangeOrderId = createString("exchangeOrderId");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> memberId = createNumber("memberId", Long.class);

    public final NumberPath<java.math.BigDecimal> mineAmount = createNumber("mineAmount", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> poundageAmount = createNumber("poundageAmount", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> poundageAmountEth = createNumber("poundageAmountEth", java.math.BigDecimal.class);

    public final StringPath symbol = createString("symbol");

    public final DateTimePath<java.util.Date> transactionTime = createDateTime("transactionTime", java.util.Date.class);

    public final StringPath type = createString("type");

    public final StringPath usdtRate = createString("usdtRate");

    public QPoundageConvertEth(String variable) {
        super(PoundageConvertEth.class, forVariable(variable));
    }

    public QPoundageConvertEth(Path<? extends PoundageConvertEth> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPoundageConvertEth(PathMetadata metadata) {
        super(PoundageConvertEth.class, metadata);
    }

}

