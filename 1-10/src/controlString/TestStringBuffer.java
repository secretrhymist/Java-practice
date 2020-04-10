package controlString;
import java.util.Random;

public class TestStringBuffer {
    static Random random = new Random();
    static String temp = new String();// 随机生成的长度为10的字符串

    public static void main(String[] args) {
        String t1 = new String("");
        StringBuffer b1 = new StringBuffer("");

        // 测试普通String用时
        long start_time = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            t1 = t1 + randomString();
        }
        long end_time = System.currentTimeMillis();
        long used_time = end_time - start_time;
        // System.out.println(start_time);
        // System.out.println(end_time);
        System.out.printf("String循环添加10000次用时: %d", used_time);

        // 测试StringBuffer用时
        start_time = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            b1 = b1.append(randomString());
        }
        end_time = System.currentTimeMillis();
        used_time = end_time - start_time;
        System.out.println("");
        System.out.printf("StringBuffer循环添加1000000次用时: %d", used_time);

    }

    public static String randomString() {
        for (int j = 0; j < 10; j++) {
            char[] c = new char[10];
            c[j] = (char) (random.nextInt(58) + 65);
            temp = String.valueOf(c);
        }
        return temp;
    }
}
