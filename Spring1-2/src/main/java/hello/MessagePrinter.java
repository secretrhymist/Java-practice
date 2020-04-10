package hello;

/**
 * 打印机
 */

public class MessagePrinter {

    public MessagePrinter() {
        super();
        System.out.println("hello.MessagePrinter...");
    }

    private MessageService service;

    /**
     * 建立和MessageService的关联关系
     * 设置service的值
     */
    //自动调用

    public void setService(MessageService service) {
        this.service = service;
    }

    public void printMessager(){
        System.out.println(this.service.getMessage());
    }
}
