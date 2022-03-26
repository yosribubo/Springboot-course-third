package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMarginMemberVO is a Querydsl query type for MarginMemberVO
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QMarginMemberVO extends BeanPath<MarginMemberVO> {

    private static final long serialVersionUID = 28058052L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMarginMemberVO marginMemberVO = new QMarginMemberVO("marginMemberVO");

    public final QInspectBean inspectBean;

    public final NumberPath<Long> leverCoinId = createNumber("leverCoinId", Long.class);

    public final NumberPath<Long> memberId = createNumber("memberId", Long.class);

    public QMarginMemberVO(String variable) {
        this(MarginMemberVO.class, forVariable(variable), INITS);
    }

    public QMarginMemberVO(Path<? extends MarginMemberVO> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMarginMemberVO(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMarginMemberVO(PathMetadata metadata, PathInits inits) {
        this(MarginMemberVO.class, metadata, inits);
    }

    public QMarginMemberVO(Class<? extends MarginMemberVO> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.inspectBean = inits.isInitialized("inspectBean") ? new QInspectBean(forProperty("inspectBean"), inits.get("inspectBean")) : null;
    }

}

