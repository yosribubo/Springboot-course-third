package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QFavorSymbol is a Querydsl query type for FavorSymbol
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QFavorSymbol extends EntityPathBase<FavorSymbol> {

    private static final long serialVersionUID = -104524493L;

    public static final QFavorSymbol favorSymbol = new QFavorSymbol("favorSymbol");

    public final StringPath addTime = createString("addTime");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> memberId = createNumber("memberId", Long.class);

    public final StringPath symbol = createString("symbol");

    public QFavorSymbol(String variable) {
        super(FavorSymbol.class, forVariable(variable));
    }

    public QFavorSymbol(Path<? extends FavorSymbol> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFavorSymbol(PathMetadata metadata) {
        super(FavorSymbol.class, metadata);
    }

}

