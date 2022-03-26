package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QInspectBean is a Querydsl query type for InspectBean
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QInspectBean extends BeanPath<InspectBean> {

    private static final long serialVersionUID = 914643873L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QInspectBean inspectBean = new QInspectBean("inspectBean");

    public final QLeverCoin leverCoin;

    public final ListPath<LeverWallet, QLeverWallet> leverWalletList = this.<LeverWallet, QLeverWallet>createList("leverWalletList", LeverWallet.class, QLeverWallet.class, PathInits.DIRECT2);

    public final ListPath<LoanRecord, QLoanRecord> loanRecordList = this.<LoanRecord, QLoanRecord>createList("loanRecordList", LoanRecord.class, QLoanRecord.class, PathInits.DIRECT2);

    public final QMember member;

    public final NumberPath<Long> memberId = createNumber("memberId", Long.class);

    public final StringPath memberName = createString("memberName");

    public final NumberPath<java.math.BigDecimal> riskRate = createNumber("riskRate", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> totalAmount = createNumber("totalAmount", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> totalLoan = createNumber("totalLoan", java.math.BigDecimal.class);

    public QInspectBean(String variable) {
        this(InspectBean.class, forVariable(variable), INITS);
    }

    public QInspectBean(Path<? extends InspectBean> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QInspectBean(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QInspectBean(PathMetadata metadata, PathInits inits) {
        this(InspectBean.class, metadata, inits);
    }

    public QInspectBean(Class<? extends InspectBean> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.leverCoin = inits.isInitialized("leverCoin") ? new QLeverCoin(forProperty("leverCoin")) : null;
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member"), inits.get("member")) : null;
    }

}

