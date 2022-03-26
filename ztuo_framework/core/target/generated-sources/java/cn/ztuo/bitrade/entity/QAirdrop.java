package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAirdrop is a Querydsl query type for Airdrop
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAirdrop extends EntityPathBase<Airdrop> {

    private static final long serialVersionUID = -1988889226L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAirdrop airdrop = new QAirdrop("airdrop");

    public final QAdmin admin;

    public final DateTimePath<java.util.Date> createTime = createDateTime("createTime", java.util.Date.class);

    public final NumberPath<Integer> errorIndex = createNumber("errorIndex", Integer.class);

    public final StringPath errorMsg = createString("errorMsg");

    public final StringPath fileName = createString("fileName");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> status = createNumber("status", Integer.class);

    public final NumberPath<Integer> successCount = createNumber("successCount", Integer.class);

    public QAirdrop(String variable) {
        this(Airdrop.class, forVariable(variable), INITS);
    }

    public QAirdrop(Path<? extends Airdrop> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAirdrop(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAirdrop(PathMetadata metadata, PathInits inits) {
        this(Airdrop.class, metadata, inits);
    }

    public QAirdrop(Class<? extends Airdrop> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.admin = inits.isInitialized("admin") ? new QAdmin(forProperty("admin"), inits.get("admin")) : null;
    }

}

