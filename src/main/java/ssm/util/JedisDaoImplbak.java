package ssm.util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;


public class JedisDaoImplbak implements JedisDao {
    @Resource
      private JedisPool jedisPool;
    @Override
    public void putObject(Object key, Object value) {
        Jedis resource=jedisPool.getResource();
        resource.set(SerializeUtil.serialize(key.toString()),SerializeUtil.serialize(value));
        resource.close();
    }

    @Override
    public Object removeObject(Object key) {
        Jedis resource=jedisPool.getResource();
        Object expire=resource.expire(SerializeUtil.serialize(key.toString()),0);
        resource.close();
        return expire;
    }

    @Override
    public Object getObject(Object key) {
        Jedis resource = jedisPool.getResource();
        Object value=SerializeUtil.unserialize(resource.get(SerializeUtil.serialize(key.toString())));
        return value;
    }
}
