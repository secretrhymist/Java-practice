package charactor;

public class APHero extends Hero {
    public String name;
    public float hp;

    public int damage;

    public APHero() {
    }

    // 增加一个初始化name的构造方法
    public APHero(String name) {
        this.name = name;
    }

    // 重写toString方法
    public String toString() {
        return name;
    }
}
