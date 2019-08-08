package Stream;

import java.util.*;

/**
 * @author huanfuan
 * @version 1.0
 * @date 2019/8/8 0008 下午 2:07
 */
public class streamTest02 {
    public static void main(String[] args) {
        List<List<String>> lists = new ArrayList<>();
        lists.add(Arrays.asList("apple", "click"));
        lists.add(Arrays.asList("boss", "dig", "qq", "vivo"));
        lists.add(Arrays.asList("c#", "biezhi"));

        lists.stream()
                .flatMap(Collection::stream)
                .filter(str -> str.length()>2)
                .count();


      
    }
}
