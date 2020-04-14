package collection;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * ArrayList: 有顺序
 * HashSet: 无顺序
 *
 * List中的数据可以重复
 * Set中的数据不能够重复
 *
 *
 */
public class TestCollection13 {
    public static void main(String[] args) {
        ArrayList<Integer> numberList =new ArrayList<Integer>();
/**        //List中的数据按照插入顺序存放
        System.out.println("----------List----------");
        System.out.println("向List 中插入 9 5 1");
        numberList.add(9);
        numberList.add(5);
        numberList.add(1);
        System.out.println("List 按照顺序存放数据:");
        System.out.println(numberList);
        System.out.println("----------Set----------");
        HashSet<Integer> numberSet =new HashSet<Integer>();
        System.out.println("向Set 中插入9 5 1");
        //Set中的数据不是按照插入顺序存放
        numberSet.add(9);
        numberSet.add(5);
        numberSet.add(1);
        System.out.println("Set 不是按照顺序存放数据:");
        System.out.println(numberSet);
    }
 **/
        //List中的数据可以重复
        System.out.println("----------List----------");
        System.out.println("向List 中插入 9 9");
        numberList.add(9);
        numberList.add(9);
        System.out.println("List 中出现两个9:");
        System.out.println(numberList);
        System.out.println("----------Set----------");
        HashSet<Integer> numberSet =new HashSet<Integer>();
        System.out.println("向Set 中插入9 9");
        //Set中的数据不能重复
        numberSet.add(9);
        numberSet.add(9);
        System.out.println("Set 中只会保留一个9:");
        System.out.println(numberSet);
    }
}
