import java.util.Scanner;

public class CalendarWatch{
        //根据输入的年份打印出以下格式的日历。例如，输入2019年，输出

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int year = sc.nextInt();
            printCalendarByYear(year);
        }
    }

    public static void printCalendarByYear(int year){
        //表示2020年的1月1日为星期三
        int dayOfWeek = 3;

        //例如year为2025年
        if(year >2020){
            for(int i = 2020;i<year;i++){
                //i表示当前遍历到的年份，对该年份进行闰年平年的判断
                if((i%4 == 0 && i%100 != 0 )||i%400 == 0){
                    dayOfWeek = (dayOfWeek + 366%7)%7;
                }else{
                    dayOfWeek = (dayOfWeek + 365%7)%7;
                }
            }
        }else{ //year < 2020的
            for(int i = 2019;i>=year;i--){
                if((i%4 == 0 && i%100 != 0)||i%400 == 0) {
                    dayOfWeek = (dayOfWeek - 366 % 7 + 7) % 7;
                }else{
                    dayOfWeek = (dayOfWeek - 365 % 7 + 7) % 7;
                }
            }
        }
        if(dayOfWeek == 0){
            dayOfWeek = 7;
        }
        for(int i = 1;i <= 12;i++){
            System.out.println("-----------------" + year + "年" + i + "月--------------------");
            System.out.println("一   二   三   四   五   六   日");
            int days = 31;
            switch(i){
                case 2:
                    if((year%4 == 0 && year%100 != 0)||year%400 ==0){
                        days = 29;
                    }else{
                        days = 28;
                    }
                    break;
                case 4: case 6:case 9:case 11:
                    days = 30;
                    break;
                default:
                    break;
            }
            for(int k = 0;k <= (dayOfWeek-1)*4;k++){ //打印合适的空格数量
                System.out.print(" ");
            }
            //把该月的所有日期轮流打印出来
            for(int j = 1; j <= days;j++){
                System.out.print(j);
                dayOfWeek++;
                if(dayOfWeek > 7){
                    dayOfWeek = 1;
                    //另起一行，从周一开始打印，不需要空格
                    System.out.println();
                }else{
                    if(j >= 10){
                        System.out.print("   ");
                    }else{
                        System.out.print("    ");
                    }
                }
            }
            //没一个月打印完之后换行
            System.out.println("\r\n\r\n");
        }

    }
}
