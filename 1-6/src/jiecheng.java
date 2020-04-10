import java.util.Scanner;

public class jiecheng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int x = sc.nextInt();
        long a = 1;
        int i = 1;
        while(i <= x){
            a = a * i;
            i++;
        }
        System.out.println("它的阶乘为:" + a);
    }
}
