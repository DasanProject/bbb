package ssm.util;

public interface JedisDao {
    //放入缓存
    void putObject(Object key, Object value);
    //清除缓存
    Object removeObject(Object key);
    //从缓存中获取
    Object getObject(Object key);
}
