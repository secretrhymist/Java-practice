/**
寻找某两个数相除，其结果离黄金分割点0.618最近
 分母和分子不能同时为偶数 分母和分子 取值范围在[1-20]
 **/
public class goldSplit {
    public static void main(String[] args) {
        int fenmu = 0; //找到的分母
        int fenzi = 0; //找到的分子
        double chazhi = 0;
        double formate_chazhi = 10000;

        for(int i = 0;i < 20;i++){
            for(int j = 0;j <20;j++){
                if(i % 2 == 0 && j % 2 == 0){
                    continue;
                }
                chazhi = (double)i/j - 0.618f;
                chazhi = chazhi<0?0- chazhi:chazhi; //差值如果是负的就取反，不然取它本身
                //找出最小的差值
                if(chazhi < formate_chazhi){
                    formate_chazhi = chazhi;
                    fenzi = i;
                    fenmu = j;
                }
            }
        }
        System.out.println("黄金分割点的分子：" + fenzi +"，分母为：" + fenmu + "最后为：" + ((double)fenzi/fenmu));
    }
}
