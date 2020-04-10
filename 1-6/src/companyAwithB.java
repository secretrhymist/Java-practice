
import java.util.Random;
public class companyAwithB {

    /**
    public static void main(String[] args) {
        int a [] = new int[]{18,62,68,82,65,9};
        int b[] = new int[3];//分配了长度是3的空间，但是没有赋值
        //通过数组赋值把，a数组的前3位赋值到b数组

        //方法一： for循环
        for (int i = 0; i < b.length; i++) {
            b[i] = a[i];
        }
        //方法二: System.arraycopy(src, srcPos, dest, destPos, length)
        //src: 源数组
        //srcPos: 从源数组复制数据的起始位置
        //dest: 目标数组
        //destPos: 复制到目标数组的启始位置
        //length: 复制的长度
        System.arraycopy(a, 0, b, 0, 3);

        //把内容打印出来
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    **/

    public static void main(String[] args) {
        int a[] = new int[(int) (Math.random() * 5)+5];
        for (int i = 0; i < a.length; i++)
            a[i] = (int) (Math.random() * 100);
        int b[] = new int[(int) (Math.random() * 5)+5];
        for (int i = 0; i < b.length; i++)
            b[i] = (int) (Math.random() * 100);

        System.out.println("数组a的内容:");
        for (int i : a) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("数组b的内容:");
        for (int i : b) {
            System.out.print(i+" ");
        }
        System.out.println();

        int c[] = new int[a.length+b.length];
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);

        System.out.println("数组c的内容:");
        for (int i : c) {
            System.out.print(i+" ");
        }

    }
}
