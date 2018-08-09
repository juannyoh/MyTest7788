package t201808;

import com.supermap.convert.impl.SuperMapCoordinateConvertImpl;

public class test2 {
    public static void main(String[] args) {
        com.supermap.entity.Point point = new com.supermap.entity.Point(120.615898,31.2957);
        com.supermap.entity.Point point1 = new com.supermap.entity.Point(120.617419,31.29578);

        point = SuperMapCoordinateConvertImpl.smLL2MC(point);
        point1 = SuperMapCoordinateConvertImpl.smLL2MC(point1);
        Double temp_A = Math.abs(point.getLon() - point1.getLon()); // ºáÏò¾àÀë
        Double temp_B = Math.abs(point.getLat() - point1.getLat()); // ÊúÏò¾àÀë
        double distance = Math.sqrt(Math.pow(temp_A, 2) + Math.pow(temp_B, 2)); // ¼ÆËã
        System.out.println(distance);

    }
}
