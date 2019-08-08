package Stream;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author huanfuan
 * @version 1.0
 * @date 2019/8/8 0008 下午 12:54
 */
public class streamTest01 {
    public static void main(String[] args) {
        Property p1 = new Property("叫了个鸡", 1000, 500, 2);
        Property p2 = new Property("张三丰饺子馆", 2300, 1500, 3);
        Property p3 = new Property("永和大王", 580, 3000, 1);
        Property p4 = new Property("肯德基", 6000, 200, 4);
        List<Property> properties = Arrays.asList(p1, p2, p3, p4);

        Collections.sort(properties,(x,y) ->x.distance.compareTo(y.distance));
        String name = properties.get(0).name;
        System.out.println("距离我最近的店铺是:" + name);

        //stream操作
        String name2=properties.stream().
                sorted(Comparator.comparingInt(x ->x.distance))
                .findFirst()
                .get().name;
        System.out.println("距离我最近的店铺是:" + name);

        /*获取所有店铺的名称*/
        List<String> names = properties.stream()
                .map(p -> p.name)
                .collect(Collectors.toList());

        /*获取每个店铺的价格等级*/
        Map<String, Integer> map = properties.stream()
                .collect(Collectors.toMap(Property::getName, Property::getPriceLevel));


        /*所有价格等级的店铺列表*/
        Map<Integer, List<Property>> priceMap = properties.stream()
                .collect(Collectors.groupingBy(Property::getPriceLevel));
    }
}
