package hello;

/**
 * 打印服务
 */

public class MessageService {

//    ctrl + O
    public MessageService() {
        super();
        System.out.println("MessageServer...");
    }

    public String getMessage(){
        return "Hello world";
    }
}
