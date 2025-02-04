package lambda; /**
 * @author huanfuan
 * @version 1.0
 * @date 2019/8/8 0008 上午 10:18
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * 使用lambda表达式和函数式接口Predicate
 * */
public class lambdaTest03 {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");

        System.out.println("Languages which starts with J :");
        filter(languages,(str)->((String)str).startsWith("J"));

        System.out.println("Languages which ends with a ");
        filter(languages,(str)->((String)str).endsWith("a"));

        System.out.println("Print all languages :");
        filter(languages,(str)->true);

        System.out.println("Print no language : ");
        filter(languages,(str)->false);

        System.out.println("Print language whose length greater than 4:");
        filter(languages, (str)->((String)str).length() > 4);


    }

    public static void filter(List<String> names, Predicate condition) {
        for (String name : names) {
            if (condition.test(name)) {
                System.out.println(name + " ");
            }

        }
    }
}