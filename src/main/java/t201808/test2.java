package t201808;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;

import com.alibaba.fastjson.JSONObject;
import com.dituhui.saas.service.api.elasticsearch.enums.CompositeType;
import com.dituhui.saas.service.api.elasticsearch.enums.SearchType;
import com.dituhui.saas.service.api.pojo.ExtendColumn;
import com.dituhui.saas.service.api.pojo.ExtendColumnCompositeSearchTree;
import com.github.stuxuhai.jpinyin.PinyinException;
import com.github.stuxuhai.jpinyin.PinyinHelper;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.supermap.convert.impl.SuperMapCoordinateConvertImpl;
import com.supermap.entity.Point;

public class test2 {

    /**
     * 处理空格
     *
     * @param str
     * @return
     */
    public static String replaceBlank(String str) {
        String dest = "";
        if (str != null) {
            str = str.trim();
            Pattern p = Pattern.compile("\\t|\r|\n");
            Matcher m = p.matcher(str);
            dest = m.replaceAll("");
            if (StringUtils.isNotEmpty(dest)) {
                dest = StringUtils.replaceAll(dest, "\\u00A0", "");
            }
        }
        return dest;
    }

    private static Gson gson = new Gson();

    public static void main(String[] args) {

        String ss = "四川省,成都市,成华区,二仙桥街道,,,,,,,";

        // System.out.println(Lists.newArrayList(StringUtils.split(ss, ",")));
        //
        // System.out.println(Lists.newArrayList(ss.split(",")));
        // int type = 1;
        //
        // switch (type) {
        // case 1:
        // System.out.println(11);
        // case 2:
        // case 3:
        // System.out.println(33);
        // break;
        // case 5:
        // System.err.println(55);
        // break;
        // default:
        // break;
        // }

        // System.out.println(Long.MAX_VALUE);
        // System.out.println(NumberFormat.getInstance().format(Math.pow(2, 64)));
        // System.out.println(gson.fromJson("省,市,区,乡镇;下拉类型,文本类型,数值类型,链接类型,id,电话;名称,下拉类型,下拉类型2,文本,数值,日期,下拉,链接,电话,id",
        // String.class));

        // String[][] params = new String[3][];
        // params[0] = new String[] { "22", "33" };
        // params[1] = new String[] { "22f", "33f" };
        // params[2] = new String[] { "22x", "33x" };
        // System.out.println(JSONObject.toJSONString(params));

        // int x = 1;
        // System.out.println(x++);
        // System.out.println(x++);

        // String pointsString =
        // "1.3089280418015717E7,3369537.880083682;1.3089391790702205E7,3369408.942255254;1.3089465530529026E7,3369299.7512975717;1.3089465029191818E7,3369313.328449008;1.3089450983067526E7,3369191.4169669044;1.3089437448185917E7,3369011.203447325;1.3089400334359087E7,3368919.307377931;1.3089399843500912E7,3368838.906601883;1.3089363740916613E7,3368725.3959710076;1.3089332656622553E7,3368619.8551821252;1.3089314621683652E7,3368509.085039319";
        //
        // String[] pointsArrStrings = pointsString.split(";");
        List<String> pointsList = Lists.newArrayList("2", "3", "4");
        List<Integer> intList = pointsList.stream().flatMap(new Function<String, Stream<Integer>>() {
            @Override
            public Stream<Integer> apply(String t) {
                return Stream.of(Integer.parseInt(t));
            }
        }).collect(Collectors.toList());
        System.out.println(intList);
        // for(String points:pointsArrStrings){
        // String xy[]=points.split(",");
        // Point point=SuperMapCoordinateConvertImpl.smMCToLatLon(new Point(Double.parseDouble(xy[0]),
        // Double.parseDouble(xy[1])));
        // pointsList.add(point.getLon()+","+point.getLat());
        // }
        // System.out.println(StringUtils.join(pointsList, ";"));
        // String aaString = "sdfsd dsf ";
        // System.out.println(replaceBlank(aaString) + "**");

        // List<ExtendColumn> pointCols = Lists.newArrayList();
        // ExtendColumn col1 = new ExtendColumn();
        // col1.setFieldName("sss（必填）");
        // col1.setFieldValue("001");
        // pointCols.add(col1);
        // ExtendColumn col2 = new ExtendColumn();
        // col2.setFieldName("ddd（必填）");
        // col2.setFieldValue(null);
        // pointCols.add(col2);
        // ExtendColumn col3 = new ExtendColumn();
        // col3.setFieldName("ttt（选填）");
        // col3.setFieldValue(null);
        // pointCols.add(col3);
        //
        // List<String> mustFieldsList = Arrays.asList("sss（必填）", "ddd（必填）");
        //
        // boolean flag = pointCols.stream().anyMatch(
        // col -> mustFieldsList.contains(col.getFieldName()) && (null == col.getFieldValue())
        // || StringUtils.isEmpty((String) col.getFieldValue()));
        //
        // System.out.println(flag);

        // final String styleCodeString = new String();
        // styleCodeString.concat("111");
        // System.out.println(styleCodeString+"**");

        // String layerNameString="成都";
        // try {
        // System.out.println(PinyinHelper.getShortPinyin(layerNameString));
        // } catch (PinyinException e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }
        //
        // Set<String> set=Sets.newHashSet();
        // set.add("11");set.add("22");
        // System.out.println(Lists.newArrayList(set));

        // ExtendColumnCompositeSearchTree tree=new ExtendColumnCompositeSearchTree();
        // tree.setCompositeType(CompositeType.And);
        // tree.setSearchTrees(Lists.newArrayList());
        //
        //
        // ExtendColumnCompositeSearchTree tree1=new ExtendColumnCompositeSearchTree();
        // tree1.setFieldName("名称");
        // tree1.setKeyword("aae4re");
        // tree1.setLayercode("001");
        // tree1.setSearchType(SearchType.StringTypeEnum.Startwith);
        // tree.getSearchTrees().add(tree1);
        // ExtendColumnCompositeSearchTree tree2=new ExtendColumnCompositeSearchTree();
        // tree2.setFieldName("名称222");
        // tree2.setKeyword("aae4re333");
        // tree2.setLayercode("002");
        // tree2.setSearchType(SearchType.StringTypeEnum.Equals);
        // tree.getSearchTrees().add(tree2);
        //
        // String jsonString=JSONObject.toJSONString(tree);
        // System.out.println(jsonString);
        //
        // ExtendColumnCompositeSearchTree treess=JSONObject.parseObject(jsonString,
        // ExtendColumnCompositeSearchTree.class);
        // com.supermap.entity.Point point = new com.supermap.entity.Point(1.2728532307313131E7,3572890.215607547);
        // point = SuperMapCoordinateConvertImpl.smMCToLatLon(point);
        // System.out.println(point.getLon()+","+point.getLat());
        // com.supermap.entity.Point point1 = new com.supermap.entity.Point(120.617419,31.29578);
        //
        // point = SuperMapCoordinateConvertImpl.smLL2MC(point);
        // point1 = SuperMapCoordinateConvertImpl.smLL2MC(point1);
        // Double temp_A = Math.abs(point.getLon() - point1.getLon()); // �������
        // Double temp_B = Math.abs(point.getLat() - point1.getLat()); // �������
        // double distance = Math.sqrt(Math.pow(temp_A, 2) + Math.pow(temp_B, 2)); // ����
        // System.out.println(distance);

    }
}
