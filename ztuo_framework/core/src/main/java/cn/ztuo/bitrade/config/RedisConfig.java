package cn.ztuo.bitrade.config;

import cn.ztuo.bitrade.util.RedisUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Component;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @Description:
 * @Author: GuoShuai
 * @Date: 2018/11/6 2:29 PM
 */
@Configuration
@Component
public class RedisConfig {


    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public Integer getRedisPort() {
        return redisPort;
    }

    public void setRedisPort(Integer redisPort) {
        this.redisPort = redisPort;
    }

    public String getRedisPassword() {
        return redisPassword;
    }

    public void setRedisPassword(String redisPassword) {
        this.redisPassword = redisPassword;
    }

    public Integer getRedisTimeout() {
        return redisTimeout;
    }

    public void setRedisTimeout(Integer redisTimeout) {
        this.redisTimeout = redisTimeout;
    }

    public Integer getMaxIdle() {
        return maxIdle;
    }

    public void setMaxIdle(Integer maxIdle) {
        this.maxIdle = maxIdle;
    }

    public Integer getMaxTotal() {
        return maxTotal;
    }

    public void setMaxTotal(Integer maxTotal) {
        this.maxTotal = maxTotal;
    }

    public Integer getMaxWaitMillis() {
        return maxWaitMillis;
    }

    public void setMaxWaitMillis(Integer maxWaitMillis) {
        this.maxWaitMillis = maxWaitMillis;
    }

    public Integer getMinEvictableIdleTimeMillis() {
        return minEvictableIdleTimeMillis;
    }

    public void setMinEvictableIdleTimeMillis(Integer minEvictableIdleTimeMillis) {
        this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
    }

    public Integer getNumTestsPerEvictionRun() {
        return numTestsPerEvictionRun;
    }

    public void setNumTestsPerEvictionRun(Integer numTestsPerEvictionRun) {
        this.numTestsPerEvictionRun = numTestsPerEvictionRun;
    }

    public long getTimeBetweenEvictionRunsMillis() {
        return timeBetweenEvictionRunsMillis;
    }

    public void setTimeBetweenEvictionRunsMillis(long timeBetweenEvictionRunsMillis) {
        this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
    }

    public boolean isTestOnBorrow() {
        return testOnBorrow;
    }

    public void setTestOnBorrow(boolean testOnBorrow) {
        this.testOnBorrow = testOnBorrow;
    }

    public boolean isTestWhileIdle() {
        return testWhileIdle;
    }

    public void setTestWhileIdle(boolean testWhileIdle) {
        this.testWhileIdle = testWhileIdle;
    }

    @Value("${redis.hostName:}")
    private String hostName;

    @Value("${redis.port:6379}")
    private Integer redisPort;

    @Value("${redis.password:}")
    private String redisPassword;

    @Value("${redis.timeout:1000}")
    private Integer redisTimeout;

    @Value("${redis.maxIdle:300}")
    private Integer maxIdle;

    @Value("${redis.maxTotal:1000}")
    private Integer maxTotal;

    @Value("${redis.maxWaitMillis:1000}")
    private Integer maxWaitMillis;

    @Value("${redis.minEvictableIdleTimeMillis:300000}")
    private Integer minEvictableIdleTimeMillis;

    @Value("${redis.numTestsPerEvictionRun:1024}")
    private Integer numTestsPerEvictionRun;

    @Value("${redis.timeBetweenEvictionRunsMillis:30000}")
    private long timeBetweenEvictionRunsMillis;

    @Value("${redis.testOnBorrow:true}")
    private boolean testOnBorrow;

    @Value("${redis.testWhileIdle:true}")
    private boolean testWhileIdle;


    /**
     * JedisPoolConfig ?????????
     *
     * @return
     */
    @Bean
    public JedisPoolConfig jedisPoolConfig() {
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        // ???????????????
        jedisPoolConfig.setMaxIdle(maxIdle);
        // ????????????????????????????????????
        jedisPoolConfig.setMaxTotal(maxTotal);
        // ??????????????????????????????
        jedisPoolConfig.setMaxWaitMillis(maxWaitMillis);
        // ????????????????????????????????? ??????1800000??????(30??????)
        jedisPoolConfig.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        // ????????????????????? ????????????????????? ????????????????????? : 1/abs(n), ??????3
        jedisPoolConfig.setNumTestsPerEvictionRun(numTestsPerEvictionRun);
        // ???????????????????????????(??????) ???????????????,????????????????????????, ??????-1
        jedisPoolConfig.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
        // ?????????????????????????????????????????????,??????????????????,????????????????????????????????????????????????
        jedisPoolConfig.setTestOnBorrow(testOnBorrow);
        // ???????????????????????????, ??????false
        jedisPoolConfig.setTestWhileIdle(testWhileIdle);
        return jedisPoolConfig;
    }

    /**
     * ?????????
     *
     * @param @param  jedisPoolConfig
     * @param @return
     * @return JedisConnectionFactory
     * @throws
     * @Title: JedisConnectionFactory
     * @date 2018???11???6???
     */
    @Bean
    public JedisConnectionFactory JedisConnectionFactory(JedisPoolConfig jedisPoolConfig) {
        JedisConnectionFactory JedisConnectionFactory = new JedisConnectionFactory(jedisPoolConfig);
        //?????????
        JedisConnectionFactory.setPoolConfig(jedisPoolConfig);
        //IP??????
        JedisConnectionFactory.setHostName(hostName);
        //?????????
        JedisConnectionFactory.setPort(redisPort);
        //??????Redis???????????????
        JedisConnectionFactory.setPassword(redisPassword);
        //????????????????????????????????????
        JedisConnectionFactory.setTimeout(redisTimeout);
        return JedisConnectionFactory;
    }

    /**
     * ????????? RedisTemplate ??????
     *
     * @return
     */
    @Bean
    public RedisTemplate<String, Object> functionDomainRedisTemplate(RedisConnectionFactory redisConnectionFactory) {
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
        initDomainRedisTemplate(redisTemplate, redisConnectionFactory);
        return redisTemplate;
    }

    /**
     * ?????????????????? redis ??????????????????,???????????????
     *
     * @param redisTemplate
     * @param factory
     */
    private void initDomainRedisTemplate(RedisTemplate<String, Object> redisTemplate, RedisConnectionFactory factory) {
        //???????????????Serializer????????????????????????????????????String????????????User????????????????????????????????????User can't cast to String???
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setHashKeySerializer(new StringRedisSerializer());
        redisTemplate.setHashValueSerializer(new GenericJackson2JsonRedisSerializer());
        redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());
        // ????????????
        redisTemplate.setEnableTransactionSupport(false);
        redisTemplate.setConnectionFactory(factory);
    }

    /**
     * ????????????RedisTemplate
     *
     * @return RedisUtil
     * @throws
     * @Title: redisUtil
     * @date 2018???11???6???
     */
    @Bean(name = "redisUtil")
    public RedisUtil redisUtil(RedisTemplate<String, Object> redisTemplate) {
        RedisUtil redisUtil = new RedisUtil();
        redisUtil.setRedisTemplate(redisTemplate);
        return redisUtil;
    }
}
