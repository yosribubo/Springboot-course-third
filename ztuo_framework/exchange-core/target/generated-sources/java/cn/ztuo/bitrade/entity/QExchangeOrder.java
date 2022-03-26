package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QExchangeOrder is a Querydsl query type for ExchangeOrder
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QExchangeOrder extends EntityPathBase<ExchangeOrder> {

    private static final long serialVersionUID = -107018392L;

    public static final QExchangeOrder exchangeOrder = new QExchangeOrder("exchangeOrder");

    public final NumberPath<java.math.BigDecimal> amount = createNumber("amount", java.math.BigDecimal.class);

    public final StringPath baseSymbol = createString("baseSymbol");

    public final NumberPath<Long> canceledTime = createNumber("canceledTime", Long.class);

    public final StringPath coinSymbol = createString("coinSymbol");

    public final NumberPath<Long> completedTime = createNumber("completedTime", Long.class);

    public final EnumPath<ExchangeOrderDirection> direction = createEnum("direction", ExchangeOrderDirection.class);

    public final EnumPath<cn.ztuo.bitrade.constant.BooleanEnum> marginTrade = createEnum("marginTrade", cn.ztuo.bitrade.constant.BooleanEnum.class);

    public final NumberPath<Long> memberId = createNumber("memberId", Long.class);

    public final StringPath orderId = createString("orderId");

    public final EnumPath<ExchangeOrderResource> orderResource = createEnum("orderResource", ExchangeOrderResource.class);

    public final NumberPath<java.math.BigDecimal> price = createNumber("price", java.math.BigDecimal.class);

    public final EnumPath<ExchangeOrderStatus> status = createEnum("status", ExchangeOrderStatus.class);

    public final StringPath symbol = createString("symbol");

    public final NumberPath<Long> time = createNumber("time", Long.class);

    public final NumberPath<java.math.BigDecimal> tradedAmount = createNumber("tradedAmount", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> triggerPrice = createNumber("triggerPrice", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> turnover = createNumber("turnover", java.math.BigDecimal.class);

    public final EnumPath<ExchangeOrderType> type = createEnum("type", ExchangeOrderType.class);

    public QExchangeOrder(String variable) {
        super(ExchangeOrder.class, forVariable(variable));
    }

    public QExchangeOrder(Path<? extends ExchangeOrder> path) {
        super(path.getType(), path.getMetadata());
    }

    public QExchangeOrder(PathMetadata metadata) {
        super(ExchangeOrder.class, metadata);
    }

}

