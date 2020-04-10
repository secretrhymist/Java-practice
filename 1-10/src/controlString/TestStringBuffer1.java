package controlString;

import java.util.Random;

public class TestStringBuffer1 {
    static Random random = new Random();
    static String temp = new String();

    public static void main(String[] args) {
        String t1 = new String("");
        StringBuffer t2 = new StringBuffer("");

        long start_time = System.currentTimeMillis();
        for(int i = 0; i < 10000;i++)
            t1 = t1 + randomString();
        long end_time = System.currentTimeMillis();
        long used_time = end_time - start_time;
        System.out.printf("String循环所用时间: %d",used_time);

        start_time = System.currentTimeMillis();
        for (int i = 0; i < 10000;i++)
            t2 = t2.append(randomString());
        end_time = System.currentTimeMillis();
        used_time = end_time - start_time;
        System.out.println("");
        System.out.printf("StringBuffer循环所用时间:%d",used_time);

    }

    public static String randomString(){
        for(int j = 0;j < 10;j++){
            char[] c = new char[10];
            c[j] = (char)(random.nextInt(58) + 65);
            temp = String.valueOf(c);
        }
        return temp;
    }


}
