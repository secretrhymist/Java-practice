package controlString;

import java.util.Arrays;

/**
创建一个长度是100的字符串数组
使用长度是2的随机字符填充该字符串数组
统计这个字符串数组里重复的字符串有多少种
 **/
public class StringTest2 {
    public static String RandomString(int length){
        String pool = "";
        for(short i = '0';i <= '9';i++){
            pool += (char) i;
        }
        for(short i = 'a';i <= 'z';i++){
            pool += (char) i;
        }
        for(short i = 'A';i <= 'Z';i++){
            pool += (char) i;
        }
        char cs[] = new char[length];
        for(int i = 0; i < cs.length;i++){
            int index = (int)(Math.random() * pool.length());
            cs[i] = pool.charAt(index);
        }
        String result = new String(cs);
        return result;
    }

    public static void main(String[] args) {
        String[] a = new String[100];
        String b = "";
        int count = 0;

        // 100个随机数
        for(int i= 0; i < a.length;i++) {
            String Sr = RandomString(2);
            a[i] = Sr;
        }
        System.out.println(Arrays.toString(a));

        //找重复
        for(int i = 0;i < a.length;i++){
            for(int j = i + 1;j < a.length;j++){
                if(a[i].equals(a[j]))
                    b = b + a[i] + "" ;
                    count ++;
            }
        }
        System.out.println("共有" + count + "个重复数据如下：");
        System.out.println(b);


    }



}
