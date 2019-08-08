package Stream.lesson1;

import lombok.Data;

/**
 * @author huanfuan
 * @version 1.0
 * @date 2019/8/8 0008 下午 12:53
 */
@Data
public class Property {

    String  name;
    // 距离，单位:米
    Integer distance;
    // 销量，月售
    Integer sales;
    // 价格，这里简单起见就写一个级别代表价格段
    Integer priceLevel;
    public Property(String name, int distance, int sales, int priceLevel) {
        this.name = name;
        this.distance = distance;
        this.sales = sales;
        this.priceLevel = priceLevel;
    }
}
