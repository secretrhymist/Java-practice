package digit;

import java.util.Scanner;

/**
1. 生成一个长度是3的随机字符串，把这个字符串作为当做密码

2. 使用穷举法生成长度是3个字符串，匹配上述生成的密码

要求： 分别使用多层for循环 和 递归解决上述问题
 **/
public class qiong_ju_fa {
    public static void main(String[] args) {
        String[] sg = new String[3];
        String password = randomString(3);//randomString是求随机字符串的方法
        System.out.println("输出随机密码:" + password);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入你的密码;");

        char[] guessPassword = new char[3];
        outloop:
        for (short i = '0'; i <= 'z'; i++) {
            for (short j = '0'; j <= 'z'; j++) {
                for (short k = '0'; k <= 'z'; k++) {
                    if (!isLetterOrDigit(i,j,k))
                        continue;
                    guessPassword[0] = (char) i;
                    guessPassword[1] = (char) j;
                    guessPassword[2] = (char) k;
                    String guess = new String(guessPassword);
//                  System.out.println("穷举出来的密码是：" + guess);

                    if(guess.equals(password)){
                        System.out.println("找到了，密码是" + guess);
                        break outloop;
                    }
                }
            }
        }
    }

    private static boolean isLetterOrDigit(short i, short j, short k) {
        return Character.isLetterOrDigit(i) &&
                Character.isLetterOrDigit(j) &&
                Character.isLetterOrDigit(k) ;
    }

    private static  String randomString(int length) {
        String pool = "";
        //单引号表示字符,双引号表示字符串
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
