import java.util.Scanner;

public class caozuofu {
    public static void main(String[] args) {
        Scanner thing = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int a = thing.nextInt();
        System.out.println("请输入第二个数：");
        int b = thing.nextInt();
        int c = a + b;
        System.out.println("两个数的总和：" + c);

    }
}
