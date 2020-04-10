public class createRandomNum {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = (int)(Math.random() * 100);
        a[1] = (int)(Math.random() * 100);
        a[2] = (int)(Math.random() * 100);
        a[3] = (int)(Math.random() * 100);
        a[4] = (int)(Math.random() * 100);
        System.out.println("--------反转前---------");
        for(int i = 0;i < a.length;i++){
            System.out.print(a[i] + "   ");
        }
        System.out.println("");
        // a.length - 1 就已经是最后一个数了。
        for(int j =a.length-1;j>=0;j--) {
            System.out.print(a[j] + "   ");
        }
    }
}
