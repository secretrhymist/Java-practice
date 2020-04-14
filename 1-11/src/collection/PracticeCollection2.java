package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 首先初始化一个List,长度是10，值是0-9。
 * 然后不断的shuffle，直到前3位出现
 * 3 1 4
 *
 * shuffle 1000,000 次，统计出现的概率
 */

public class PracticeCollection2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++) {
            numbers.add(i);
        }
//        System.out.println("集合中的数据：");
//        System.out.println(numbers);

        int count = 0;
        for(int i = 0; i < 1000 * 1000; i++){
            Collections.shuffle(numbers);
            if(numbers.get(0) == 3 && numbers.get(1) ==1 && numbers.get(2) == 4)
                count++;
        }
        double rate = count/(1000d * 1000);
        System.out.println("出现概率为：" + rate * 100 + "%");


    }
}
