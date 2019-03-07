package ssm.util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class TestRedisConnect {
    public static void main(String[] args) {
        Jedis jedis=new Jedis("192.168.126.9",6379);
        System.out.println(jedis.ping());
      //  Jedis jedis=new Jedis("192.168.126.9",6379);
        //jedis.ping();
        JedisPool jedisPool=new JedisPool("192.168.126.9",6379);
        Jedis resource = jedisPool.getResource();


    }
}
