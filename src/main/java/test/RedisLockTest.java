//package test;
//
//import java.lang.reflect.Array;
//import java.net.URLDecoder;
//import java.util.Arrays;
//import java.util.Base64.Decoder;
//import java.util.Base64.Encoder;
//import java.util.List;
//import java.util.Map;
//
//import org.apache.commons.lang.RandomStringUtils;
//import org.apache.commons.lang.math.RandomUtils;
//
//public class RedisLockTest {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////		System.out.println(URLDecoder.decode("{layer_codes=%5B%2240288cd34940eb3a014940f9ab9e0000%22%2C%2240288cd34940eb3a014940f9abc10001%22%2C%2240288cd34940eb3a014940f9abc10002%22%2C%2240288cd34940eb3a014940f9abc10003%22%2C%2240288cd34940eb3a014940f9abc10004%22%2C%2240288f5e57fb42390157ff0322600003%22%2C%2240288f5e57fb423901582ddb7e080005%22%2C%2240288f5e57fb4239015842da4a990006%22%2C%2240288f5e57fb4239015842da9a5f0007%22%2C%2240288f5e57fb4239015842db390e0008%22%5D, top_user_id=402893b75b13f225015b1414ec49001e, has_geo=true, filters=%5B%7B%22columeName%22%3A%22type%22%2C%22must%22%3Atrue%2C%22operation%22%3A%22EQUAL%22%2C%22type%22%3A%22NUMBER%22%2C%22value%22%3A%221%22%7D%5D}"));
//	   /* byte s=12;
//	    int a=32;
//	    System.out.println(s^a);
//	    System.out.println(s^a^a);*/
//		
//		String xx="1_2,3";
//		List<String> sss=Arrays.asList("1","2");
//		System.out.println(sss.toString());
//		System.out.println(RandomStringUtils.random(5, "utf-8"));
//		
//		Map map=null;
//		System.out.println(map.isEmpty());
//	}
//
//	
////	Redis 获取数据 
//	public static String get(String key) {
//		Jedis jedis = null; 
//		int redisIndex = RedisUtils.getRedisIndex(key);
//		try { jedis = getRedis(redisIndex); jedis.select(1); 
//		// 缓存过期 && 获取锁成功 
//		// setnx:原子操作，如果不存在则设置值，并返回 1 。如果缓存存在，则返回 0 ，设置缓存失败 
//		if(jedis.setnx("lock_"+key, System.currentTimeMillis()+"")==1)
//		{ 
//			/** * 将锁的有效时间设为 60s ，在 60s 内如果查询数据库成功，
//			 * 则更新该锁的失效时间=缓存时间。 * 如果 60s 内出现异常，
//			 * 则 60s 后第一个请求又会去访问数据库... * 返回 null 
//			 * 表示没有查询到数据库，外层代码会通过数据库获取数据 */
//			
//			jedis.expire("lock_"+key, 60); return null; } 
//		// (缓存未过期) || (缓存过期，但是获取锁失败) then 返回旧的数据 
//		else{ jedis.select(0); return jedis.get(key); } } 
//		catch (JedisException e) { if (jedis != null)
//		{ returnBrokenResource(jedis, redisIndex); 
//		// 避免在 finally 中再次关闭 reids jedis = null; } 
//		throw e; } 
//		finally 
//		{ if (jedis != null) {
//			returnResource(jedis, redisIndex); 
//			} 
//		} 
//		}
//		}
//	}
//
////	Redis 缓存数据 
//	public static boolean set(String key, String value, int seconds) {
//		Jedis jedis = null; int redisIndex = RedisUtils.getRedisIndex(key); 
//		try { jedis = getRedis(redisIndex); 
//		if (seconds > 0){ 
//			// 添加缓存，缓存有效时间=真实时间+1 天 
//			jedis.setex(key, seconds + 60 * 60 *24 , value);
//			jedis.select(1); 
//			// 添加缓存锁，有效时间 =真实时间 
//			jedis.setex("lock_" + key, seconds, System.currentTimeMillis()+""); }
//		else{ jedis.set(key, value); jedis.select(1); 
//		jedis.set("lock_" + key, System.currentTimeMillis()+""); } 
//		return true; } 
//		catch (JedisException e) 
//		{ if (jedis != null) 
//		{ returnBrokenResource(jedis, redisIndex); 
//		// 避免在 finally 中再次关闭 
//		reids jedis = null; } 
//		throw e; } finally { 
//			if (jedis != null) {
//				returnResource(jedis, redisIndex); } } }
//		}
//	}
//}
