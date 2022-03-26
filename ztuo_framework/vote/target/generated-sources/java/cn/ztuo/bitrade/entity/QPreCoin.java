package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPreCoin is a Querydsl query type for PreCoin
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPreCoin extends EntityPathBase<PreCoin> {

    private static final long serialVersionUID = -1316565487L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPreCoin preCoin = new QPreCoin("preCoin");

    public final NumberPath<Integer> amount = createNumber("amount", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath link = createString("link");

    public final StringPath name = createString("name");

    public final StringPath remark = createString("remark");

    public final StringPath unit = createString("unit");

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public final QVote vote;

    public QPreCoin(String variable) {
        this(PreCoin.class, forVariable(variable), INITS);
    }

    public QPreCoin(Path<? extends PreCoin> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPreCoin(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPreCoin(PathMetadata metadata, PathInits inits) {
        this(PreCoin.class, metadata, inits);
    }

    public QPreCoin(Class<? extends PreCoin> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.vote = inits.isInitialized("vote") ? new QVote(forProperty("vote")) : null;
    }

}

