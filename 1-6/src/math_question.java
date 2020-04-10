public class math_question {
    public static void main(String[] args) {
        for(int i = 0;i <= 8;i++){
            for(int j = 0; j <= 7;j++) {
                for (int k = 0; k <=14; k++) {
                    for(int z = 0;z <= 10; z++){
                        if(i + j == 8 && k - z == 6 && i + k == 14 && j + z == 10){
                            System.out.println("结果为：");
                            System.out.println(i);
                            System.out.println(j);
                            System.out.println(k);
                            System.out.println(z);
                            System.out.println("====");
                        }
                    }

                }
            }
        }
    }
}
