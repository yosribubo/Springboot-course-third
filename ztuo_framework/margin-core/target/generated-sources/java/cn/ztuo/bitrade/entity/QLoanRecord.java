package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLoanRecord is a Querydsl query type for LoanRecord
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QLoanRecord extends EntityPathBase<LoanRecord> {

    private static final long serialVersionUID = 2044862980L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QLoanRecord loanRecord = new QLoanRecord("loanRecord");

    public final NumberPath<java.math.BigDecimal> accumulative = createNumber("accumulative", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> amount = createNumber("amount", java.math.BigDecimal.class);

    public final QCoin coin;

    public final DateTimePath<java.util.Date> createTime = createDateTime("createTime", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<java.math.BigDecimal> interestRate = createNumber("interestRate", java.math.BigDecimal.class);

    public final QLeverCoin leverCoin;

    public final NumberPath<java.math.BigDecimal> loanBalance = createNumber("loanBalance", java.math.BigDecimal.class);

    public final NumberPath<Long> memberId = createNumber("memberId", Long.class);

    public final StringPath memberName = createString("memberName");

    public final EnumPath<cn.ztuo.bitrade.constant.BooleanEnum> repayment = createEnum("repayment", cn.ztuo.bitrade.constant.BooleanEnum.class);

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public QLoanRecord(String variable) {
        this(LoanRecord.class, forVariable(variable), INITS);
    }

    public QLoanRecord(Path<? extends LoanRecord> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QLoanRecord(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QLoanRecord(PathMetadata metadata, PathInits inits) {
        this(LoanRecord.class, metadata, inits);
    }

    public QLoanRecord(Class<? extends LoanRecord> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.coin = inits.isInitialized("coin") ? new QCoin(forProperty("coin")) : null;
        this.leverCoin = inits.isInitialized("leverCoin") ? new QLeverCoin(forProperty("leverCoin")) : null;
    }

}

