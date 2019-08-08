package Stream.lesson2;

import java.util.Arrays;
import java.util.List;

/**
 * @author huanfuan
 * @version 1.0
 * @date 2019/8/8 0008 下午 2:25
 * 连接：https://zhuanlan.zhihu.com/p/33313312
 */
public class Stream1 {
    public static void main(String[] args) {
        List<String> myList =
                Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList.stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}
