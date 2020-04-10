public class jiajiajianjian {
    public static void main(String[] args) {
        int i = 5;
        System.out.println(i++); //输出5
        System.out.println(i);   //输出6

        int j = 5;
        System.out.println(++j); //输出6
        System.out.println(j);	 //输出6
    }
    // i++ 先取值 在运算；
    // ++i 先运算，再取值。
}
