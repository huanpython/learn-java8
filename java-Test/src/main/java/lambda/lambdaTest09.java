package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author huanfuan
 * @version 1.0
 * @date 2019/8/8 0008 上午 11:15
 */


/**
 * 复制不同的值，创建一个子列表
 * */
public class lambdaTest09 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
        List<Integer>distinct =numbers.stream().map(i ->i*i).distinct().collect(Collectors.toList());
        System.out.printf("Original List : %s,  Square Without duplicates : %s %n", numbers, distinct );
    }
}
