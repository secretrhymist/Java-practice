package charactor;

public class Hero {
    public String name;
    public float hp;

    public int damage;

    public Hero() {

    }

    public Hero(String name) {

        this.name = name;
    }

    public String toString() {
        return String.format("[name:%s hp:%.0f]%n", name,hp);
    }
}
