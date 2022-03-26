package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMemberGrade is a Querydsl query type for MemberGrade
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMemberGrade extends EntityPathBase<MemberGrade> {

    private static final long serialVersionUID = -489983718L;

    public static final QMemberGrade memberGrade = new QMemberGrade("memberGrade");

    public final NumberPath<Integer> dayWithdrawCount = createNumber("dayWithdrawCount", Integer.class);

    public final NumberPath<java.math.BigDecimal> exchangeFeeRate = createNumber("exchangeFeeRate", java.math.BigDecimal.class);

    public final NumberPath<Integer> gradeBound = createNumber("gradeBound", Integer.class);

    public final StringPath gradeCode = createString("gradeCode");

    public final StringPath gradeName = createString("gradeName");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<java.math.BigDecimal> withdrawCoinAmount = createNumber("withdrawCoinAmount", java.math.BigDecimal.class);

    public QMemberGrade(String variable) {
        super(MemberGrade.class, forVariable(variable));
    }

    public QMemberGrade(Path<? extends MemberGrade> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMemberGrade(PathMetadata metadata) {
        super(MemberGrade.class, metadata);
    }

}

