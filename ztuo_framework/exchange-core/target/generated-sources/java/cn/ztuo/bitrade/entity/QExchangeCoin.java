package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QExchangeCoin is a Querydsl query type for ExchangeCoin
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QExchangeCoin extends EntityPathBase<ExchangeCoin> {

    private static final long serialVersionUID = -142359753L;

    public static final QExchangeCoin exchangeCoin = new QExchangeCoin("exchangeCoin");

    public final NumberPath<Integer> baseCoinScale = createNumber("baseCoinScale", Integer.class);

    public final NumberPath<java.math.BigDecimal> baseFee = createNumber("baseFee", java.math.BigDecimal.class);

    public final StringPath baseSymbol = createString("baseSymbol");

    public final NumberPath<Integer> coinScale = createNumber("coinScale", Integer.class);

    public final StringPath coinSymbol = createString("coinSymbol");

    public final StringPath defaultSymbol = createString("defaultSymbol");

    public final NumberPath<Integer> enable = createNumber("enable", Integer.class);

    public final EnumPath<cn.ztuo.bitrade.constant.BooleanEnum> enableMarketBuy = createEnum("enableMarketBuy", cn.ztuo.bitrade.constant.BooleanEnum.class);

    public final EnumPath<cn.ztuo.bitrade.constant.BooleanEnum> enableMarketSell = createEnum("enableMarketSell", cn.ztuo.bitrade.constant.BooleanEnum.class);

    public final NumberPath<java.math.BigDecimal> fee = createNumber("fee", java.math.BigDecimal.class);

    public final NumberPath<Integer> flag = createNumber("flag", Integer.class);

    public final NumberPath<Integer> maxTradingOrder = createNumber("maxTradingOrder", Integer.class);

    public final NumberPath<Integer> maxTradingTime = createNumber("maxTradingTime", Integer.class);

    public final NumberPath<java.math.BigDecimal> maxVolume = createNumber("maxVolume", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> minSellPrice = createNumber("minSellPrice", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> minTurnover = createNumber("minTurnover", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> minVolume = createNumber("minVolume", java.math.BigDecimal.class);

    public final NumberPath<Integer> sort = createNumber("sort", Integer.class);

    public final StringPath symbol = createString("symbol");

    public final NumberPath<Integer> zone = createNumber("zone", Integer.class);

    public QExchangeCoin(String variable) {
        super(ExchangeCoin.class, forVariable(variable));
    }

    public QExchangeCoin(Path<? extends ExchangeCoin> path) {
        super(path.getType(), path.getMetadata());
    }

    public QExchangeCoin(PathMetadata metadata) {
        super(ExchangeCoin.class, metadata);
    }

}

