package t201808;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import com.google.common.collect.Lists;

public class test1 {
    public static void main(String[] args) {
        NumberFormat numberFormat = NumberFormat.getIntegerInstance();
        numberFormat.setRoundingMode(RoundingMode.HALF_UP);
        numberFormat.setGroupingUsed(false);
        numberFormat.setMaximumFractionDigits(3);
        double length = 10.1042;
        System.out.println(numberFormat.format(length / 10));

        List<String> lio = Lists.newArrayList("");
        List<String> ll2 = new ArrayList<String>();
        System.out.println("####" + lio + ";" + ll2);
        System.out.println(CollectionUtils.isNotEmpty(lio));
        
        if(CollectionUtils.isNotEmpty(lio)){
            lio=lio.stream().filter(mapping->StringUtils.isNotBlank(mapping)).collect(Collectors.toList());
        }
        
        System.out.println("####" + lio + ";" + ll2);
        System.out.println(CollectionUtils.isNotEmpty(lio));
        
    }
}
