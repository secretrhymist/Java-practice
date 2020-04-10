import java.util.Scanner;

public class example_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的身高(m)：");
        float height = sc.nextFloat();
        System.out.println("请输入您的体重（kg）：");
        float weight = sc.nextFloat();
        float BMI = weight/(height*height);
        System.out.println("您的BMI为：" + BMI);

        if(BMI < 18.5){
            System.out.println("体重过轻");
        }else if(18.5 < BMI && BMI < 24){
            System.out.println("正常范围");
        }else if(BMI > 24 && BMI < 27){
            System.out.println("过重了");
        }else{
            System.out.println("胖砸");
        }
    }
}
