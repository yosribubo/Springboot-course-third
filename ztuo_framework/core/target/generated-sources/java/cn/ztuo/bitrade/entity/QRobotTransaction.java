package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QRobotTransaction is a Querydsl query type for RobotTransaction
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRobotTransaction extends EntityPathBase<RobotTransaction> {

    private static final long serialVersionUID = 96828535L;

    public static final QRobotTransaction robotTransaction = new QRobotTransaction("robotTransaction");

    public final NumberPath<java.math.BigDecimal> amount = createNumber("amount", java.math.BigDecimal.class);

    public final DateTimePath<java.util.Date> createTime = createDateTime("createTime", java.util.Date.class);

    public final NumberPath<java.math.BigDecimal> fee = createNumber("fee", java.math.BigDecimal.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> memberId = createNumber("memberId", Long.class);

    public final StringPath symbol = createString("symbol");

    public final EnumPath<cn.ztuo.bitrade.constant.TransactionType> type = createEnum("type", cn.ztuo.bitrade.constant.TransactionType.class);

    public QRobotTransaction(String variable) {
        super(RobotTransaction.class, forVariable(variable));
    }

    public QRobotTransaction(Path<? extends RobotTransaction> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRobotTransaction(PathMetadata metadata) {
        super(RobotTransaction.class, metadata);
    }

}

