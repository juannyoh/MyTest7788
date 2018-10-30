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
            // System.out.println(query.toString());
            // logger.info(query.toString());
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
        params.put("ak", "2239af3f4632433589391b6c497b5a0f");
        params.put("custom_id", "{\"fieldName\":\"网点编号\",\"fieldValue\":\"799999\"}");
        // params.put("x", "120.12");
        // params.put("y", "30.123");
        // params.put("name", "网点1API");
        // params.put("coord_type", "gcj02");
        params.put(
                "infos",
                "[{\"fieldName\":\"网点名称\",\"fieldValue\":\"广东测试1\"},{\"fieldName\":\"站点代码\",\"fieldValue\":\"799999\"},{\"fieldName\":\"抬头区域\",\"fieldValue\":\"null\"},{\"fieldName\":\"交接中心\",\"fieldValue\":\"null\"},{\"fieldName\":\"录单目的地\",\"fieldValue\":\"广东测试1\"},{\"fieldName\":\"负责人\",\"fieldValue\":\"null\"},{\"fieldName\":\"负责人手机号码\",\"fieldValue\":\"null\"},{\"fieldName\":\"联系电话\",\"fieldValue\":\"null\"},{\"fieldName\":\"增值服务及其它\",\"fieldValue\":\"\"},{\"fieldName\":\"地址\",\"fieldValue\":\"null\"},{\"fieldName\":\"特殊服务范围\",\"fieldValue\":\"null\"},{\"fieldName\":\"不派送范围\",\"fieldValue\":\"null\"},{\"fieldName\":\"派送时效\",\"fieldValue\":\"null\"}]");
        // params.put("x", "89.234");
        // params.put("y", "43.487");
        // params.put("name", "网点1");
        // params.put("layer_code", "01e");
        // params.put("coord_type", "gcj02");
        // params.put("infos",
        // "[{\"fieldName\":\"负责人\",\"fieldValue\":\"张三\"},{\"fieldName\":\"电话\",\"fieldValue\":\"12345678\"}]");
        params.put("t", "1535705583637");

        // params.put("ak", "af99ac257f4449ce86f2a3f402abcc53");
        // params.put("user_account", "lTj2ij4WRl1gpcguwxXE6g==");
        // params.put("user_password", "T2jr4OeUl5BiEu2TJGoSltuyFT0UKz8OVu8py9xs64g=");
        // params.put("role_level", "3");
        // params.put("t", "1504672784955");
        // params.put("isAvailable", "true");
        // params.put("layer_rights",
        // "{\"isClear\":false,\"rights\":[{\"layerCode\":\"017\",\"optType\":3},{\"layerCode\":\"017_001\",\"optType\":1}]}");
        // params.put("sign", "bb94072576c99e37739bc956f5cc3e2a");

        String sign = EncryptUtils.signRequest(params, "063708f3d64e4cdcbd75dd061a54e1f4");
        System.out.println(sign);

    }
}
