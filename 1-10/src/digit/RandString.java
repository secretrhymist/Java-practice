package digit;
//创建一个长度是5的随机字符串，随机字符有可能是数字，大写字母或者小写字母

public class RandString {
    public static void main(String[] args) {
        char[] arr = new char[5];
        int b;
        for (int i = 0; i < 5; i++) {
            b = (int) (Math.random() * 90 + 47);
            if (b <= 57 && b >= 48) {
                arr[i] = (char) b;
            } else if (b <= 90 && b >= 65) {
                arr[i] = (char) b;
            } else if (b <= 122 && b >= 97) {
                arr[i] = (char) b;
            } else {
                i = i - 1;
                continue;
            }
            System.out.print(arr[i]);
        }
    }
}
