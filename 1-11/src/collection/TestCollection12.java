package collection;
//线程非安全——————>线程安全

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class TestCollection12 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();

        System.out.println("把非线程安全的List转换为线程安全的List");
        List<Integer> synchronizedNumbers = (List<Integer>) Collections.synchronizedList(numbers);

    }
}
