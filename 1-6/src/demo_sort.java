
public class demo_sort {
    public static void main(String[] args) {
        //冒泡排序算法
        int[] numbers=new int[]{1,5,8,2,3,9,4};
        int i,j;
        //i从零开始到最后一个数之前的数
        //for 遍历
        for(i=0;i<numbers.length-1;i++)
        {
            // j到i之前的那个数
            for(j=0;j<numbers.length-1-i;j++)
            {
                //这几行表示比较之后交换
                if(numbers[j]>numbers[j+1])
                {
                    int temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
        }
        System.out.println("从小到大排序后的结果是:");
        for(i=0;i<numbers.length;i++)
            System.out.print(numbers[i]+" ");
    }
}

