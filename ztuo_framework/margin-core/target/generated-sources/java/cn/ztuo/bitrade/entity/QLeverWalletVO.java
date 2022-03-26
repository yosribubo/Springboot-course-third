package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLeverWalletVO is a Querydsl query type for LeverWalletVO
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QLeverWalletVO extends BeanPath<LeverWalletVO> {

    private static final long serialVersionUID = 1888598681L;

    public static final QLeverWalletVO leverWalletVO = new QLeverWalletVO("leverWalletVO");

    public final NumberPath<java.math.BigDecimal> baseAccumulativeCount = createNumber("baseAccumulativeCount", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> baseCanLoan = createNumber("baseCanLoan", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> baseLoanCount = createNumber("baseLoanCount", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> coinAccumulativeCount = createNumber("coinAccumulativeCount", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> coinCanLoan = createNumber("coinCanLoan", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> coinLoanCount = createNumber("coinLoanCount", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> explosionPrice = createNumber("explosionPrice", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> explosionRiskRate = createNumber("explosionRiskRate", java.math.BigDecimal.class);

    public final ListPath<LeverWallet, QLeverWallet> leverWalletList = this.<LeverWallet, QLeverWallet>createList("leverWalletList", LeverWallet.class, QLeverWallet.class, PathInits.DIRECT2);

    public final NumberPath<Long> memberId = createNumber("memberId", Long.class);

    public final NumberPath<java.math.BigDecimal> proportion = createNumber("proportion", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> riskRate = createNumber("riskRate", java.math.BigDecimal.class);

    public final StringPath symbol = createString("symbol");

    public QLeverWalletVO(String variable) {
        super(LeverWalletVO.class, forVariable(variable));
    }

    public QLeverWalletVO(Path<? extends LeverWalletVO> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLeverWalletVO(PathMetadata metadata) {
        super(LeverWalletVO.class, metadata);
    }

}

