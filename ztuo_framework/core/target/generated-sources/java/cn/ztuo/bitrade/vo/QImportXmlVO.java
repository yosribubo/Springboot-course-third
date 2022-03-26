package cn.ztuo.bitrade.vo;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QImportXmlVO is a Querydsl query type for ImportXmlVO
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QImportXmlVO extends BeanPath<ImportXmlVO> {

    private static final long serialVersionUID = 1840674302L;

    public static final QImportXmlVO importXmlVO = new QImportXmlVO("importXmlVO");

    public final NumberPath<Double> amount = createNumber("amount", Double.class);

    public final StringPath coinName = createString("coinName");

    public final StringPath coinUnit = createString("coinUnit");

    public final NumberPath<Long> memberId = createNumber("memberId", Long.class);

    public final StringPath memberName = createString("memberName");

    public final StringPath phone = createString("phone");

    public QImportXmlVO(String variable) {
        super(ImportXmlVO.class, forVariable(variable));
    }

    public QImportXmlVO(Path<? extends ImportXmlVO> path) {
        super(path.getType(), path.getMetadata());
    }

    public QImportXmlVO(PathMetadata metadata) {
        super(ImportXmlVO.class, metadata);
    }

}

