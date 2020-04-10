package exception;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        Date start=new Date();
        Date end=new Date();

        //如果没有按照这个格式,则抛出异常
        try {
            start=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("1970-1-1 00:00:00");
            end=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2000-1-1 00:00:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //产生随机数
        System.out.println("得到随机日期数组：");
        String[] datetime=new String[9];
        long[] time=new long[9];
        for(int i=0;i<9;i++){
            time[i]=(long)(Math.random()*(end.getTime()-start.getTime()+1))+start.getTime();
            Date date=new Date(time[i]);
            datetime[i]=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
            System.out.print(datetime[i]+"\t");
            if((i+1)%3==0){
                System.out.println();
            }
        }
        System.out.println("排序后的随机日期数组：");
        long empty;
        for(int i=0;i<9;i++){
            for(int j=i+1;j<9;j++){
                if(time[j]>time[i]){
                    empty=time[i];
                    time[i]=time[j];
                    time[j]=empty;
                }
            }

        }
        for(int i=0;i<9;i++){
            Date date=new Date(time[i]);
            datetime[i]=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
            System.out.print(datetime[i]+"\t");
            if((i+1)%3==0){
                System.out.println();
            }
        }

    }
}


