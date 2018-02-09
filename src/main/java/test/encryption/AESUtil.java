package test.encryption;

import java.security.SecureRandom;
import java.util.Scanner;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;


//import sun.misc.BASE64Decoder;
//import sun.misc.BASE64Encoder;


/**
 * AES加密解密工具
 *
 *
 */
public class AESUtil {
	
	/**
	 * 加密算法名称
	 */
	private static final String algorithm_name="AES";
	
	private static final String passWord ="dituhui123456!@#";
	
	private static final String vector=passWord;
	/**
	 * 加密 1.构�?密钥生成�?2.根据ecnodeRules规则初始化密钥生成器 3.产生密钥 4.创建和初始化密码�?5.内容加密 6.返回字符�?
	 * @param content 待加密的字符�?
	 * @return 加密的结�?
	 * @see
	 */
	public static String encode(String content) {
		try {
			// 1.构�?密钥生成器，指定为AES算法,不区分大小写
			KeyGenerator keygen = KeyGenerator.getInstance(algorithm_name);
			// 2.根据ecnodeRules规则初始化密钥生成器
			// 生成�?��128位的随机�?根据传入的字节数�?
			keygen.init(128, new SecureRandom(passWord.getBytes()));
			// 3.产生原始对称密钥
			SecretKey original_key = keygen.generateKey();
			// 4.获得原始对称密钥的字节数�?
			byte[] raw = original_key.getEncoded();
			// 5.根据字节数组生成AES密钥
			SecretKey key = new SecretKeySpec(raw, algorithm_name);
			// 6.根据指定算法AES自成密码�?
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			// 7.初始化密码器，第�?��参数为加�?Encrypt_mode)或�?解密解密(Decrypt_mode)操作，第二个参数为使用的KEY
			cipher.init(Cipher.ENCRYPT_MODE, key,new IvParameterSpec((vector.getBytes())));
			// 8.获取加密内容的字节数�?这里要设置为utf-8)不然内容中如果有中文和英文混合中文就会解密为乱码
			byte[] byte_encode = content.getBytes("utf-8");
			// 9.根据密码器的初始化方�?-加密：将数据加密
			byte[] byte_AES = cipher.doFinal(byte_encode);
			// 10.将加密后的数据转换为字符�?
			String AES_encode = new String(Base64.encodeBase64(byte_AES));
//			String AES_encode=new BASE64Encoder().encode(byte_AES);
			// 11.将字符串返回
			return AES_encode;
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return null;
	}

	/**
	 * 解密 解密过程�?1.同加�?-4�?2.将加密后的字符串反纺成byte[]数组 3.将加密内容解�?
	 * @param content 待解密的数据
	 * @return
	 * @see
	 */
	public static String dncode(String content) {
		try {
			// 1.构�?密钥生成器，指定为AES算法,不区分大小写
			KeyGenerator keygen = KeyGenerator.getInstance(algorithm_name);
			// 2.根据ecnodeRules规则初始化密钥生成器
			// 生成�?��128位的随机�?根据传入的字节数�?
			keygen.init(128, new SecureRandom(passWord.getBytes()));
			// 3.产生原始对称密钥
			SecretKey original_key = keygen.generateKey();
			// 4.获得原始对称密钥的字节数�?
			byte[] raw = original_key.getEncoded();
			// 5.根据字节数组生成AES密钥
			SecretKey key = new SecretKeySpec(raw, algorithm_name);
			// 6.根据指定算法AES自成密码�?
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			// 7.初始化密码器，第�?��参数为加�?Encrypt_mode)或�?解密(Decrypt_mode)操作，第二个参数为使用的KEY
			cipher.init(Cipher.DECRYPT_MODE, key,new IvParameterSpec(vector.getBytes()));
			// 8.将加密并编码后的内容解码成字节数�?
			byte[] byte_content =Base64.decodeBase64(content);
			/*
			 * 解密
			 */
			byte[] byte_decode = cipher.doFinal(byte_content);
			String AES_decode = new String(byte_decode, "utf-8");
			return AES_decode;
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 如果有错就返加nulll
		return null;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
		 * 加密
		 */
//		System.out.println("使用AES对称加密，请输入加密的规�?);
//		String encodeRules = scanner.next();
		System.out.println("请输入要加密的内�?");
		String content = scanner.next();
		System.out.println("根据输入的规�? "+ AESUtil.encode(content));

		/*
		 * 解密
		 */
//		System.out.println("使用AES对称解密，请输入加密的规则：(须与加密相同)");
//		encodeRules = scanner.next();
		System.out.println("请输入要解密的内容（密文�?");
		content = scanner.next();
		System.out.println("根据输入的规�? +/* encodeRules + */"
				+ AESUtil.dncode(content));
	}

}
