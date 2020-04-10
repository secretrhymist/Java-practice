package jiekou_jicheng;

public class Fish extends Animal implements Pet {
    private String name;
    protected Fish(int leg){
        super(leg);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("鱼儿瞎玩");
    }

    @Override
    public void eat() {
        System.out.println(name + "吃鱼饵");
    }

    public static void main(String[] args) {
        Fish fish = new Fish(0);
        fish.setName("撕拉布鲁-禄大夫-斯德哥尔-大咖其-我的🐎u-啊");
        fish.eat();
        fish.play();
    }
}
