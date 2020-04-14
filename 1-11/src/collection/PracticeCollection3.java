package collection;


import java.util.HashSet;
import java.util.Set;

/**
 * 生成50个 0-9999之间的随机数，要求不能有重复的
 */
public class PracticeCollection3 {
    public static void main(String[] args) {
//        Set<Integer> ct = new HashSet<Integer>();
//        while(ct.size() < 50){
//            int i = (int)(Math.random() * 10000);
//            ct.add(i);
//        }
//        System.out.println("得到五十个不重复随机数：");
//        System.out.println(ct + " ");

        HashSet<Integer> random = new HashSet<Integer>();
        while (random.size() != 50)
            random.add((int) (Math.random() * 10000) - 1);

        int i = 0;
        for (int j : random) {
            System.out.print(j + " ");
            i++;
            if (0 == i % 10)
                System.out.println();
        }
    }

}
