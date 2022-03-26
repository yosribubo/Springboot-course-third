package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QIntegrationRecord is a Querydsl query type for IntegrationRecord
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QIntegrationRecord extends EntityPathBase<IntegrationRecord> {

    private static final long serialVersionUID = -1886504638L;

    public static final QIntegrationRecord integrationRecord = new QIntegrationRecord("integrationRecord");

    public final NumberPath<Long> amount = createNumber("amount", Long.class);

    public final DateTimePath<java.util.Date> createTime = createDateTime("createTime", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> memberId = createNumber("memberId", Long.class);

    public final EnumPath<cn.ztuo.bitrade.constant.IntegrationRecordType> type = createEnum("type", cn.ztuo.bitrade.constant.IntegrationRecordType.class);

    public QIntegrationRecord(String variable) {
        super(IntegrationRecord.class, forVariable(variable));
    }

    public QIntegrationRecord(Path<? extends IntegrationRecord> path) {
        super(path.getType(), path.getMetadata());
    }

    public QIntegrationRecord(PathMetadata metadata) {
        super(IntegrationRecord.class, metadata);
    }

}

