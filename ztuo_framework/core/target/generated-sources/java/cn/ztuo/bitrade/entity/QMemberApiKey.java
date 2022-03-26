package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMemberApiKey is a Querydsl query type for MemberApiKey
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMemberApiKey extends EntityPathBase<MemberApiKey> {

    private static final long serialVersionUID = 1816966402L;

    public static final QMemberApiKey memberApiKey = new QMemberApiKey("memberApiKey");

    public final StringPath apiKey = createString("apiKey");

    public final StringPath apiName = createString("apiName");

    public final StringPath bindIp = createString("bindIp");

    public final DateTimePath<java.util.Date> createTime = createDateTime("createTime", java.util.Date.class);

    public final DateTimePath<java.util.Date> expireTime = createDateTime("expireTime", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> memberId = createNumber("memberId", Long.class);

    public final StringPath remark = createString("remark");

    public final StringPath secretKey = createString("secretKey");

    public QMemberApiKey(String variable) {
        super(MemberApiKey.class, forVariable(variable));
    }

    public QMemberApiKey(Path<? extends MemberApiKey> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMemberApiKey(PathMetadata metadata) {
        super(MemberApiKey.class, metadata);
    }

}

