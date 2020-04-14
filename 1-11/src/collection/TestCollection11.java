package collection;
/**
 * reverse 反转
 * shuffle 混淆
 * sort 排序
 * swap 交换
 * rotate 滚动
 *
 */


import java.util.ArrayList;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestCollection11 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            numbers.add(i);
        }
        System.out.println("集合中的数据");
        System.out.println(numbers);

        Collections.reverse(numbers);
        System.out.println("反转后的数据");
        System.out.println(numbers);

        Collections.shuffle(numbers);
        System.out.println("混淆后的数据：");
        System.out.println(numbers);

        Collections.sort(numbers);
        System.out.println("排序后集合中的数据：");
        System.out.println(numbers);

//        Collections.swap(numbers,0,5);
//        System.out.println("交换0和5下标的数据：");
//        System.out.println(numbers);

        Collections.rotate(numbers,2);
        System.out.println("把集合向右滚动2个单位后的数据：");
        System.out.println(numbers);



    }
}
