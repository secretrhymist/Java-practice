package controlString;
//借助随机数，创建一个从1995.1.1 00:00:00 到 1995.12.31 23:59:59之间的随机日期
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Date;

public class TestDate2 {
    public static void main(String[] args) {
        Date time1 = new Date(95,0,1,0,0,0);
        Date time2 = new Date(95,11,31,23,59,59);
        System.out.println("95年的第一天" + time1);
        System.out.println("95年的最后一个天" + time2);
//        System.out.println(time1.getTime());
//        System.out.println(time2.getTime());
        System.out.println("----------------------------");
        long a1 = time1.getTime();
        long a2 = time2.getTime();
        long differ = a2 - a1;
        long number = (long)(Math.random() * differ);
        long newNumber = number + a1;
        Date time3 = new Date(newNumber);
        System.out.println("之间的一个随机时间为：" + time3);





    }

}
