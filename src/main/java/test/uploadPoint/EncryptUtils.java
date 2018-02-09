package test.uploadPoint;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.HmacUtils;
import org.apache.commons.lang3.StringUtils;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

public class EncryptUtils {


    public static final String SIGN_PARAM_NAME = "sign";
    private static final Set<String> writeList = Sets.newHashSet();// 白名单

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
                if (StringUtils.isNotEmpty(key) && !StringUtils.equalsIgnoreCase(key, SIGN_PARAM_NAME)
                        && StringUtils.isNotEmpty(value)) {
                    query.append(key).append(value);
                }
            }
            //System.out.println(query.toString());
            //logger.info(query.toString());
            // 第三步：使用MD5/HMAC加密
            byte[] encrpted = HmacUtils.hmacMd5(secret.getBytes("UTF-8"), query.toString().getBytes("UTF-8"));
            // 第四步：把二进制转化为大写的十六进制
            return Hex.encodeHexString(encrpted);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 是否在签名白名单内
     * 
     * @param teamID
     * @return
     */
    public static boolean isEncryptWriteList(String teamID) {
        return writeList.contains(teamID);
    }

    public static void main(String[] args) {
        Map<String, String> params = Maps.newHashMap();
        params.put("ak", "b82f5241ff6f4a32b78ef7e034bab693");
        params.put("user_account", "FpVBFEBdQWH3WXrhbHmZng==");
        params.put("user_password", "L5Z+4iObqSG6WHQyyrVdyQ==");
        params.put("role_level", "3");
        params.put("t", "45651039031");
        params.put("isAvailable", "true");
//        params.put("layer_rights",
//                "{\"isClear\":false,\"rights\":[{\"layerCode\":\"026\",\"optType\":1},{\"layerCode\":\"02a\",\"optType\":2}]}");
//        params.put("sign", "bb94072576c99e37739bc956f5cc3e2a");

        String sign = EncryptUtils.signRequest(params, "8aafdd8c5d8eaf58015d97c032780027");
        System.out.println(sign);
        
        
        
    }
}
