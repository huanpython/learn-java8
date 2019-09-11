package Stream.lesson2;

import Stream.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author huanfuan
 * @version 1.0
 * @date 2019/8/8 0008 下午 2:49
 */
public class Stream2 {
    public static void main(String[] args) {
        String id="430,285";
        String[] lists = id.split(",");
        List<Long> datas = new ArrayList<>();
        for(int i = 0;i<lists.length;i++){
            Long item = Long.valueOf(lists[i]);
            datas.add(item);
        }

        System.out.println(datas);
    }
}
