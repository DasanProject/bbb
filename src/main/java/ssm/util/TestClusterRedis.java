package ssm.util;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.util.HashSet;
import java.util.Set;

public class TestClusterRedis {
    public static void main(String[] args) {
        Set<HostAndPort> hap=new HashSet<HostAndPort>();
        hap.add(new HostAndPort("192.168.126.9",7001));
        hap.add(new HostAndPort("192.168.126.9",7002));
        hap.add(new HostAndPort("192.168.126.9",7003));
        hap.add(new HostAndPort("192.168.126.10",7004));
        hap.add(new HostAndPort("192.168.126.10",7005));
        hap.add(new HostAndPort("192.168.126.10",7006));
        JedisCluster jedisCluster=new JedisCluster(hap);
        jedisCluster.set("cmy","jiayouba");
        String aaa=jedisCluster.get("cmy");
        System.out.println(aaa);


    }
}
