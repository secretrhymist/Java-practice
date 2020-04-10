public class yinhangfuli {

    public static void main(String[] args) {
        int F = 1000000;  //最终收入
        int p = 12000; //本金
        double r = 0.2;
        int i = 1; //年份
        double x = p * (1 + r);
        while(x < F){
            i++;
            System.out.println(i + "年初收入为：" + x);
            x = (x + p) * (1 + r);
            if(x >= F){
                System.out.println((i+1) +"年收入为：" + x);
                break;
            }


        }
    }

}
