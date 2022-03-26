package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLeverWalletTransferRecord is a Querydsl query type for LeverWalletTransferRecord
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QLeverWalletTransferRecord extends EntityPathBase<LeverWalletTransferRecord> {

    private static final long serialVersionUID = -2027495396L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QLeverWalletTransferRecord leverWalletTransferRecord = new QLeverWalletTransferRecord("leverWalletTransferRecord");

    public final NumberPath<java.math.BigDecimal> amount = createNumber("amount", java.math.BigDecimal.class);

    public final QCoin coin;

    public final DateTimePath<java.util.Date> createTime = createDateTime("createTime", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QLeverCoin leverCoin;

    public final NumberPath<Long> memberId = createNumber("memberId", Long.class);

    public final StringPath memberName = createString("memberName");

    public final NumberPath<Integer> type = createNumber("type", Integer.class);

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public QLeverWalletTransferRecord(String variable) {
        this(LeverWalletTransferRecord.class, forVariable(variable), INITS);
    }

    public QLeverWalletTransferRecord(Path<? extends LeverWalletTransferRecord> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QLeverWalletTransferRecord(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QLeverWalletTransferRecord(PathMetadata metadata, PathInits inits) {
        this(LeverWalletTransferRecord.class, metadata, inits);
    }

    public QLeverWalletTransferRecord(Class<? extends LeverWalletTransferRecord> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.coin = inits.isInitialized("coin") ? new QCoin(forProperty("coin")) : null;
        this.leverCoin = inits.isInitialized("leverCoin") ? new QLeverCoin(forProperty("leverCoin")) : null;
    }

}

