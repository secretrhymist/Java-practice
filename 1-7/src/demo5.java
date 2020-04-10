/**
首先定义一个5X8的二维数组，然后使用随机数填充满。
        借助Arrays的方法对二维数组进行排序。

参考思路：
先把二维数组使用System.arraycopy进行数组复制到一个一维数组
然后使用sort进行排序
最后再复制回到二维数组。
**/

import java.util.Arrays;
public class demo5 {
    public static void main(String[] args) {
        int[][] arr1 = new int[5][8];
        int[] b= new int[10];
        System.out.println("初始数组为：");
        //随机赋值二维数组
        for(int i = 0; i < 5;i++){
            for(int j = 0; j < 8;j++){
                arr1 [i][j] = (int)(Math.random() * 100);
                System.out.print(arr1 [i][j] + "  ");
            }
            System.out.println("\t");
        }
        for(int i = 0;i < 5;i++){
            b = Arrays.copyOfRange(arr1[i],0,8);
            Arrays.sort(b);
            arr1[i] = Arrays.copyOfRange(b,0,8);
        }
        System.out.println("排序后的数组为：");
        for(int i=0;i<5;i++){
            for(int j=0;j<8;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
