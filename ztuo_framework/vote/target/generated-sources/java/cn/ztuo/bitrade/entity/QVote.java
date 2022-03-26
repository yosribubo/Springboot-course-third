package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QVote is a Querydsl query type for Vote
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QVote extends EntityPathBase<Vote> {

    private static final long serialVersionUID = 1697300941L;

    public static final QVote vote = new QVote("vote");

    public final NumberPath<java.math.BigDecimal> amount = createNumber("amount", java.math.BigDecimal.class);

    public final DateTimePath<java.util.Date> createTime = createDateTime("createTime", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<PreCoin, QPreCoin> preCoins = this.<PreCoin, QPreCoin>createList("preCoins", PreCoin.class, QPreCoin.class, PathInits.DIRECT2);

    public final EnumPath<cn.ztuo.bitrade.constant.BooleanEnum> status = createEnum("status", cn.ztuo.bitrade.constant.BooleanEnum.class);

    public final NumberPath<Integer> voteLimit = createNumber("voteLimit", Integer.class);

    public QVote(String variable) {
        super(Vote.class, forVariable(variable));
    }

    public QVote(Path<? extends Vote> path) {
        super(path.getType(), path.getMetadata());
    }

    public QVote(PathMetadata metadata) {
        super(Vote.class, metadata);
    }

}

