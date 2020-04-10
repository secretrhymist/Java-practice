package jiekou_jicheng;

public class Spider extends Animal {
    protected Spider(int leg){
        super(leg);
    }
    public void eat(){
        System.out.println("蜘蛛在吃屎");
    }

    public static void main(String[] args) {
        Spider zhizhu = new Spider(8);
        zhizhu.walk();
        zhizhu.eat();
    }

}
