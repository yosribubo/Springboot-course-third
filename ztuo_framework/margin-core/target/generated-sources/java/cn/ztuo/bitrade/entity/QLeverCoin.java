package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QLeverCoin is a Querydsl query type for LeverCoin
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QLeverCoin extends EntityPathBase<LeverCoin> {

    private static final long serialVersionUID = -1863167944L;

    public static final QLeverCoin leverCoin = new QLeverCoin("leverCoin");

    public final StringPath baseSymbol = createString("baseSymbol");

    public final StringPath coinSymbol = createString("coinSymbol");

    public final EnumPath<cn.ztuo.bitrade.constant.BooleanEnum> enable = createEnum("enable", cn.ztuo.bitrade.constant.BooleanEnum.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<java.math.BigDecimal> interestRate = createNumber("interestRate", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> minTurnIntoAmount = createNumber("minTurnIntoAmount", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> minTurnOutAmount = createNumber("minTurnOutAmount", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> proportion = createNumber("proportion", java.math.BigDecimal.class);

    public final NumberPath<Integer> sort = createNumber("sort", Integer.class);

    public final StringPath symbol = createString("symbol");

    public QLeverCoin(String variable) {
        super(LeverCoin.class, forVariable(variable));
    }

    public QLeverCoin(Path<? extends LeverCoin> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLeverCoin(PathMetadata metadata) {
        super(LeverCoin.class, metadata);
    }

}

