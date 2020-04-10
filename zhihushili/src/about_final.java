public class about_final {
    public void method1(final int j) {
//        j = 5; //这个能否执行？
    }

    public static void main(String[] args) {
        new about_final().method1(6);
    }
}
