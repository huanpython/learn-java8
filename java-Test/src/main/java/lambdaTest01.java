import java.util.Arrays;
import java.util.List;



//todo demo链接 https://zhuanlan.zhihu.com/p/33477686

public class lambdaTest01 {
    public static void main(String[] args) {
        List features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
//        features.forEach(n -> System.out.printf(String.valueOf(n)));
        features.forEach(System.out::println);

        List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");

    }
}
