import java.util.Scanner;

public class qigaiyaoqian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("乞丐要饭的天数:");
        int time = sc.nextInt();
        int sum = 0;
        int salary = 1;
        for(int i = 0;i < time;i++){
            if(i == 0)
                salary = 1;
            else{
                salary *= 2;
            }
            sum += salary;
            System.out.println(salary);
        }
    }
}
