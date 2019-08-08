package Stream.lesson1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author huanfuan
 * @version 1.0
 * @date 2019/8/8 0008 下午 2:13
 * Stream并行流
 */
public class streamTest03 {
    public static void main(String[] args) {
        Property p1 = new Property("叫了个鸡", 1000, 500, 2);
        Property p2 = new Property("张三丰饺子馆", 2300, 1500, 3);
        Property p3 = new Property("永和大王", 580, 3000, 1);
        Property p4 = new Property("肯德基", 6000, 200, 4);
        List<Property> properties = Arrays.asList(p1, p2, p3, p4);


        /*筛选出价格等级小于4，按照距离排序的2个店铺名*/
        properties.stream()
                .filter(p -> p.priceLevel<4)
                .sorted(Comparator.comparingInt(Property::getDistance))
                .map(Property::getName)
                .limit(2)
                .collect(Collectors.toList());


        /*调用 parallelStream 方法即能并行处理*/
        properties.parallelStream()
                .filter(p -> p.priceLevel<4)
                .sorted(Comparator.comparingInt(Property::getDistance))
                .map(Property::getName)
                .limit(2)
                .collect(Collectors.toList());

    }
}
