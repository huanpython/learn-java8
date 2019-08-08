/**
 * @author huanfuan
 * @version 1.0
 * @date 2019/8/8 0008 上午 11:19
 */


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * 对列表的每个元素应用函数
 * */
public class lambdaTest08 {
    public static void main(String[] args) {
        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");
        String G7Countries=G7.stream().map(x ->x.toUpperCase()).collect(Collectors.joining(","));
        System.out.printf(G7Countries);
    }
}
