package digit;

import java.util.Arrays;

/**
创建一个长度是8的字符串数组
使用8个长度是5的随机字符串初始化这个数组
对这个数组进行排序，按照每个字符串的首字母排序(无视大小写)
 **/
//数组的冒泡排序

public class String_Arr_Sort {
    public static void main(String[] args) {
        String[] cr = new String[8];
        System.out.println("----------------------排序前----------------------");
        for(int i= 0; i < cr.length;i++){
            String randomString = randomString(5);
            cr[i] = randomString;
        }
        System.out.println(Arrays.toString(cr));

        for(int j = 0;j < cr.length;j++){
            for(int i = 0;i <cr.length -1 -j;i++){
                char firstChar1 = cr[i].charAt(0);
                char firstChar2 = cr[i + 1].charAt(0);
                firstChar1 = Character.toLowerCase(firstChar1);
                firstChar2 = Character.toLowerCase(firstChar2);

                if(firstChar1 > firstChar2){
                    String temp = cr[i];
                    cr[i] = cr[i+1];
                    cr[i+1] = temp;
                }
            }
        }
        System.out.println("----------------------排序后----------------------");
        System.out.println(Arrays.toString(cr));
    }

    private static  String randomString(int length){
        String pool = "";
        //单引号表示字符,双引号表示字符串
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
}
