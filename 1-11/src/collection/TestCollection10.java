package collection;

import java.util.HashSet;

/**
 * 创建一个长度是100的字符串数组
 * 使用长度是2的随机字符填充该字符串数组
 * 统计这个字符串数组里重复的字符串有多少种
 * 使用HashSet来解决这个问题
 */

public class TestCollection10 {
    public static void main(String[] args) {
        String[] Sg = new String[100];
        for(int i = 0;i < Sg.length;i++){
            Sg[i] = randomString(2);
        }

        //打印
        for (int i = 0; i < Sg.length; i++) {
            System.out.print(Sg[i] + " ");
            //换行
            if (19 == i % 20)
                System.out.println();
        }
        HashSet<String> result = new HashSet<String>();
        for(String s1:Sg){
            int repeat = 0;
            for(String s2:Sg){
                if(s1.equalsIgnoreCase(s2))
                    repeat++;
                    if (2 == repeat) {
                        // 当repeat==2的时候，就找到了一个非己的重复字符串
                        result.add(s2);
                        break;
                    }
            }

        }
        System.out.printf("总共有 %d种重复的字符串%n", result.size());
        if (result.size() != 0) {
            System.out.println("分别是：");
            for (String s : result) {
                System.out.print(s + " ");
            }
        }
    }

    private static String randomString(int length) {
        String pool = "";
        for (short i = '0'; i <= '9'; i++) {
            pool += (char) i;
        }
        for (short i = 'a'; i <= 'z'; i++) {
            pool += (char) i;
        }
        for (short i = 'A'; i <= 'Z'; i++) {
            pool += (char) i;
        }
        char cs[] = new char[length];
        for (int i = 0; i < cs.length; i++) {
            int index = (int) (Math.random() * pool.length());
            cs[i] = pool.charAt(index);
        }
        String result = new String(cs);
        return result;
    }
}



