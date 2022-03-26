package cn.ztuo.bitrade.vo;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QChannelVO is a Querydsl query type for ChannelVO
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QChannelVO extends BeanPath<ChannelVO> {

    private static final long serialVersionUID = 604030287L;

    public static final QChannelVO channelVO = new QChannelVO("channelVO");

    public final NumberPath<Integer> channelCount = createNumber("channelCount", Integer.class);

    public final NumberPath<java.math.BigDecimal> channelReward = createNumber("channelReward", java.math.BigDecimal.class);

    public final NumberPath<Long> memberId = createNumber("memberId", Long.class);

    public QChannelVO(String variable) {
        super(ChannelVO.class, forVariable(variable));
    }

    public QChannelVO(Path<? extends ChannelVO> path) {
        super(path.getType(), path.getMetadata());
    }

    public QChannelVO(PathMetadata metadata) {
        super(ChannelVO.class, metadata);
    }

}

