package digit;

import java.util.Scanner;

public class chuan_shuzu {
    public static void main(String[] args) {
        System.out.println("请输入任意数字字母符号等:");
        Scanner sc = new Scanner(System.in);
        String abc = sc.nextLine();
        System.out.println("其中大写字母和数字有:");
        char[] cr = abc.toCharArray();
        for(int i = 0;i < cr.length-1;i++){
            char j = cr[i];
            if (Character.isUpperCase(j) || Character.isDigit(j)) {
                System.out.print(j+" ");
            }
//        for(char each:cr){
//            Character ca=each;
//            if(ca.isUpperCase(ca)||ca.isDigit(ca)) {
//                System.out.print(ca);
//            }
        }
    }
}
