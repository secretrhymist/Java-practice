public class water_nice_flower_tree {
    public static void main(String[] args) {
        int num;

        for(int i = 0;i<10;i++){
            for(int j = 0;j<10;j++){
                for(int k = 0;k<10;k++){
                    if(i * 100 + j * 10 + k  == i*i*i + j*j*j + k*k*k){
                        num = i * 100 + j * 10 + k;
                        System.out.println(num);
                    }

                }
            }
        }
    }
}
