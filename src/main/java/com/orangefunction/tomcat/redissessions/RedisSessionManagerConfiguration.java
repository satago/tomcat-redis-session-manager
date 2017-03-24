package com.orangefunction.tomcat.redissessions;

public interface RedisSessionManagerConfiguration {
    void setHost(String host);

    void setPort(int port);

    void setDatabase(int database);

    void setTimeout(int timeout);

    void setPassword(String password);

    void setSerializationStrategyClass(String strategy);

    void setSessionPersistPolicies(String sessionPersistPolicies);

    void setSentinels(String sentinels);

    void setSentinelMaster(String master);

    void setRejectedSessions(int i);

    void setConnectionPoolMaxTotal(int connectionPoolMaxTotal);

    void setConnectionPoolMaxIdle(int connectionPoolMaxIdle);

    void setConnectionPoolMinIdle(int connectionPoolMinIdle);

    void setLifo(boolean lifo);

    void setMaxWaitMillis(long maxWaitMillis);

    void setMinEvictableIdleTimeMillis(long minEvictableIdleTimeMillis);

    void setSoftMinEvictableIdleTimeMillis(long softMinEvictableIdleTimeMillis);

    void setNumTestsPerEvictionRun(int numTestsPerEvictionRun);

    void setTestOnCreate(boolean testOnCreate);

    void setTestOnBorrow(boolean testOnBorrow);

    void setTestOnReturn(boolean testOnReturn);

    void setTestWhileIdle(boolean testWhileIdle);

    void setTimeBetweenEvictionRunsMillis(long timeBetweenEvictionRunsMillis);

    void setEvictionPolicyClassName(String evictionPolicyClassName);

    void setBlockWhenExhausted(boolean blockWhenExhausted);

    void setJmxEnabled(boolean jmxEnabled);

    void setJmxNameBase(String jmxNameBase);

    void setJmxNamePrefix(String jmxNamePrefix);
}
