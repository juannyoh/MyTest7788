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
////	Redis ��ȡ���� 
//	public static String get(String key) {
//		Jedis jedis = null; 
//		int redisIndex = RedisUtils.getRedisIndex(key);
//		try { jedis = getRedis(redisIndex); jedis.select(1); 
//		// ������� && ��ȡ���ɹ� 
//		// setnx:ԭ�Ӳ��������������������ֵ�������� 1 �����������ڣ��򷵻� 0 �����û���ʧ�� 
//		if(jedis.setnx("lock_"+key, System.currentTimeMillis()+"")==1)
//		{ 
//			/** * ��������Чʱ����Ϊ 60s ���� 60s �������ѯ���ݿ�ɹ���
//			 * ����¸�����ʧЧʱ��=����ʱ�䡣 * ��� 60s �ڳ����쳣��
//			 * �� 60s ���һ�������ֻ�ȥ�������ݿ�... * ���� null 
//			 * ��ʾû�в�ѯ�����ݿ⣬�������ͨ�����ݿ��ȡ���� */
//			
//			jedis.expire("lock_"+key, 60); return null; } 
//		// (����δ����) || (������ڣ����ǻ�ȡ��ʧ��) then ���ؾɵ����� 
//		else{ jedis.select(0); return jedis.get(key); } } 
//		catch (JedisException e) { if (jedis != null)
//		{ returnBrokenResource(jedis, redisIndex); 
//		// ������ finally ���ٴιر� reids jedis = null; } 
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
////	Redis �������� 
//	public static boolean set(String key, String value, int seconds) {
//		Jedis jedis = null; int redisIndex = RedisUtils.getRedisIndex(key); 
//		try { jedis = getRedis(redisIndex); 
//		if (seconds > 0){ 
//			// ��ӻ��棬������Чʱ��=��ʵʱ��+1 �� 
//			jedis.setex(key, seconds + 60 * 60 *24 , value);
//			jedis.select(1); 
//			// ��ӻ���������Чʱ�� =��ʵʱ�� 
//			jedis.setex("lock_" + key, seconds, System.currentTimeMillis()+""); }
//		else{ jedis.set(key, value); jedis.select(1); 
//		jedis.set("lock_" + key, System.currentTimeMillis()+""); } 
//		return true; } 
//		catch (JedisException e) 
//		{ if (jedis != null) 
//		{ returnBrokenResource(jedis, redisIndex); 
//		// ������ finally ���ٴιر� 
//		reids jedis = null; } 
//		throw e; } finally { 
//			if (jedis != null) {
//				returnResource(jedis, redisIndex); } } }
//		}
//	}
//}
