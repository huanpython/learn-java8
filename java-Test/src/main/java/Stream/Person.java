package Stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author huanfuan
 * @version 1.0
 * @date 2019/8/8 0008 下午 2:49
 */
public class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name;
    }

    List<Person> persons =
            Arrays.asList(
                    new Person("Max", 18),
                    new Person("Peter", 23),
                    new Person("Pamela", 23),
                    new Person("David", 12));

}
