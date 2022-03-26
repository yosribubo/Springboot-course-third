package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QVoteDetail is a Querydsl query type for VoteDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QVoteDetail extends EntityPathBase<VoteDetail> {

    private static final long serialVersionUID = -964528002L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QVoteDetail voteDetail = new QVoteDetail("voteDetail");

    public final NumberPath<java.math.BigDecimal> amount = createNumber("amount", java.math.BigDecimal.class);

    public final DateTimePath<java.util.Date> createTime = createDateTime("createTime", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QPreCoin preCoin;

    public final NumberPath<Long> userId = createNumber("userId", Long.class);

    public final QVote vote;

    public final NumberPath<Integer> voteAmount = createNumber("voteAmount", Integer.class);

    public QVoteDetail(String variable) {
        this(VoteDetail.class, forVariable(variable), INITS);
    }

    public QVoteDetail(Path<? extends VoteDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QVoteDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QVoteDetail(PathMetadata metadata, PathInits inits) {
        this(VoteDetail.class, metadata, inits);
    }

    public QVoteDetail(Class<? extends VoteDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.preCoin = inits.isInitialized("preCoin") ? new QPreCoin(forProperty("preCoin"), inits.get("preCoin")) : null;
        this.vote = inits.isInitialized("vote") ? new QVote(forProperty("vote")) : null;
    }

}

