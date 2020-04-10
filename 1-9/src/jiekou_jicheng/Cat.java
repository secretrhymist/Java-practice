package jiekou_jicheng;

public class Cat extends Animal implements Pet {
    String name;
    protected Cat(String name){
        super(4);
        this.name = name;
    }
    public Cat(){
        this("");
    }

    @Override
    public void eat() {
        System.out.println(name + "is eatting!");
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
        System.out.println(name + "is playing!");
    }

    public static void main(String[] args) {
        Cat neko = new Cat();
        neko.setName("喵喵");
        neko.eat();
        neko.play();
    }

}
