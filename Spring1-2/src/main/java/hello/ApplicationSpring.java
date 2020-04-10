package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//alt + enter去除没用的包

//扫描所有有Component注解的类

public class ApplicationSpring {
    public static void main(String[] args) {
        System.out.println("application");

        //初始化Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //从容器中获取MessagePrinter对象
        MessagePrinter printer = context.getBean(MessagePrinter.class);

        //打印消息
        printer.printMessager();
    }
}
