public class zuoyongyu {
    int i = 1; //属性名是i
    public void method1(int i){ //参数也是i
        System.out.println(i);
    }
    public static void main(String[] args) {
        new zuoyongyu().method1(5);
        //结果打印出来是 1还是5?
    }
}
