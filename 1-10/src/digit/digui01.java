package digit;
//兔子数列
public class digui01 {
    public static void main(String[] args) {
        System.out.println(test(12));
    }
    public static int test(int n){
        if(n == 1||n == 2){
            return 1;
        }
        return test(n-1) + test(n-2);
    }
}



