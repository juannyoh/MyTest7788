package test.encryption;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.HmacUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * 加密工具
 */
public class EncryptionUtil {

	private static final String passWord = /* "abcdefgabcdefg12"; */"dituhui123456!@#";

	public static final String IV = passWord;/* "0807060504030201"; */

	/*******************************************************************
	 * AES加密算法
	 * 
	 * @author moyun 加密用的Key 可以�?6个字母和数字组成，最好不要用保留字符，虽然不会错，至于�?么裁决，个人看情况�?�?
	 *         此处使用AES-128-CBC加密模式，key�?���?6位�?
	 * */

	// 加密
	public static String Encrypt(String sSrc, String sKey) throws Exception {

		if (sKey == null) {
			return null;
		}
		// 判断Key是否�?6�?
		if (sKey.length() != 16) {
			return null;
		}
		byte[] raw = sKey.getBytes();

		SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");// "算法/模式/补码方式"
		IvParameterSpec iv = new IvParameterSpec(IV.getBytes());// 使用CBC模式，需要一个向量iv，可增加加密算法的强�?
		cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);
		byte[] encrypted = cipher.doFinal(sSrc.getBytes());

		return Base64.encodeBase64String(encrypted);// 此处使用BAES64做转码功能，同时能起�?�?
	}

	// 解密
	public static String Decrypt(String sSrc, String sKey) throws Exception {
		// 判断Key是否正确
		if (sKey == null) {
			return null;
		}
		// 判断Key是否�?6�?
		if (sKey.length() != 16) {
			return null;
		}
		byte[] raw = sKey.getBytes("ASCII");

		SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
		IvParameterSpec iv = new IvParameterSpec(IV.getBytes());
		cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
		byte[] encrypted1 = Base64.decodeBase64(sSrc);// 先用bAES64解密
		try {
			byte[] original = cipher.doFinal(encrypted1);
			String originalString = new String(original);
			return originalString;
		} catch (Exception e) {
			return null;
		}
	}

	 public static void main(String[] args) throws Exception {
	
//	 String pwd = "123456";
//	 String epwd = Encrypt(pwd, passWord);
//	 System.out.println(epwd);
//	 System.out.println(Decrypt(epwd, passWord));
		 
		 Map<String,String> map=new HashMap<String,String>();
		 map.put("ak", "b82f5241ff6f4a32b78ef7e034bab693");
		 map.put("x", "11566015.82003");
		 map.put("y", "4323043.69509");
		 map.put("name", "API添加");
		 map.put("layer_code", "02c");
		 map.put("coord_type", "gcj02mc");
		 map.put("infos", "[{\"fieldName\":\"负责人\",\"fieldValue\":\"张三\"},{\"fieldName\":\"电话\",\"fieldValue\":\"12345678\"}]");
		 String sign=signRequest(map,"8aafdd8c5d8eaf58015d97c032780027");
		 System.out.println(sign);
	 }

	/**
	 * 对输入参数签名
	 * 
	 * @param params
	 * @param secret
	 * @return
	 * @throws IOException
	 */
	public static String signRequest(Map<String, String> params, String secret) {
		try {
			// 第一步：参数排序
			String[] keys = params.keySet().toArray(new String[0]);
			Arrays.sort(keys);

			// 第二步：把所有参数名和参数值串在一起
			StringBuilder query = new StringBuilder();
			for (String key : keys) {
				String value = params.get(key);
				if (StringUtils.isNotEmpty(key)
						&& !StringUtils.equalsIgnoreCase(key, "sign")
						&& StringUtils.isNotEmpty(value)) {
					query.append(key).append(value);
				}
			}

			// 第三步：使用MD5/HMAC加密
			byte[] encrpted = HmacUtils.hmacMd5(secret.getBytes("UTF-8"), query
					.toString().getBytes("UTF-8"));
			// 第四步：把二进制转化为大写的十六进制
			return Hex.encodeHexString(encrpted);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
