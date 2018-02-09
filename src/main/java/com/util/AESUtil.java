package com.util;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;


/**
 * AES 是一种可逆加密算法，对用户的敏感信息加密处理 对原始数据进行AES加密后，在进行Base64编码转化；
 */
public class AESUtil {

    /*
     * 加密用的Key 可以用26个字母和数字组成 此处使用AES-128-CBC加密模式，key需要为16位。
     */
	
	/**
	 * 加密
	 * @param encData 原始待加密串
	 * @param key 16位key
	 * @param ivs  16位向量
	 * @return
	 * @throws Exception
	 * @see
	 */
    public static String Encrypt(String encData ,String key,String ivs) throws Exception {
        if(key == null) {
            return null;
        }
        if(key.length() != 16) {
            return null;
        }
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        byte[] raw = key.getBytes();
        SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
        IvParameterSpec iv = new IvParameterSpec(ivs.getBytes());// 使用CBC模式，需要一个向量iv，可增加加密算法的强度
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);
        byte[] encrypted = cipher.doFinal(encData.getBytes("utf-8"));
        return Base64.encodeBase64String(encrypted);// 此处使用BASE64做转码。
    }

    /**
     * 解密
     * @param sSrc
     * @param key 16位key
	 * @param ivs  16位向量
     * @return
     * @throws Exception
     * @see
     */
	public static String Decrypt(String sSrc,String key,String ivs) throws Exception {
        try {
            byte[] raw = key.getBytes("ASCII");
            SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            IvParameterSpec iv = new IvParameterSpec(ivs.getBytes());
            cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
            byte[] encrypted1 =Base64.decodeBase64(sSrc);// 先用base64解密
            byte[] original = cipher.doFinal(encrypted1);
            String originalString = new String(original, "utf-8");
            return originalString;
        } catch (Exception ex) {
            return null;
        }
    }
    
    public static void main(String[] args) throws Exception {
        // 需要加密的字串
        String cSrc = "1234567890";
        
        String key="8aafdd8c5d8eaf58015d97c032780027";
        
        System.out.println(key.substring(0, 16));
        System.out.println(key.substring(16, key.length()));
        
        // 加密
        String enString = AESUtil.Encrypt(cSrc, key.substring(0, 16), key.substring(16, key.length()));
        System.out.println("加密后的字串是：" + enString);
        // 解密
        String DeString = AESUtil.Decrypt(enString, key.substring(0, 16), key.substring(16, key.length()));
        System.out.println("解密后的字串是：" + DeString);
    }

}