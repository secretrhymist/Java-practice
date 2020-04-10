public class luojicaozuofu {
    public static void main(String[] args) {
        int i = 1;
        boolean b = !(i++ == 3)^ (i++ ==2) && (i++==3);
        //i的值         2           3
        //表达式        false       因为是先运算这时2=2为true
        //            true         true
        //              异或 为false       && 和
        //                          false
        System.out.println(b);
        System.out.println(i);
    }
    // i++ 先取值 在运算；
    // ++i 先运算，再取值。
}
