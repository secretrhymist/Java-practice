public class shuzu55 {
    public static void main(String[] args) {
        int[][] arr1 = new int[5][5];
        //随机赋值二维数组
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++ ){
                arr1 [i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println("输出生成的随机数组：");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr1 [i][j] + " ");
            }
            System.out.println("\t");
        }
        int max = 0;
        int m = 0;
        int n = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(arr1[i][j]>max) {
                    max = arr1[i][j];
                    m = i;
                    n = j;
                }
            }
        }
        System.out.println("找出来最大的数是：" + max);
        System.out.println("其坐标是：" + "[" + m + "]" + "[" + n + "]");
    }
}
