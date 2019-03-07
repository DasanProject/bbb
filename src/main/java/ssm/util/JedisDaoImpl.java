package ssm.util;

import org.springframework.stereotype.Repository;
import redis.clients.jedis.JedisCluster;

import javax.annotation.Resource;


public class JedisDaoImpl implements JedisDao {
    @Resource
      private JedisCluster jedisCluster;
    @Override
    public void putObject(Object key, Object value) {
       // Jedis resource=jedisPool.getResource();
        jedisCluster.set(SerializeUtil.serialize(key.toString()),SerializeUtil.serialize(value));
      //  resource.close();
    }

    @Override
    public Object removeObject(Object key) {
       // Jedis resource=jedisPool.getResource();
        Object expire=jedisCluster.expire(SerializeUtil.serialize(key.toString()),0);
      //  resource.close();
        return expire;
    }

    @Override
    public Object getObject(Object key) {
       // Jedis resource = jedisPool.getResource();
        Object value=SerializeUtil.unserialize(jedisCluster.get(SerializeUtil.serialize(key.toString())));
        return value;
    }
}
