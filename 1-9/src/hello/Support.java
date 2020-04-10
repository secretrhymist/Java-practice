package hello;

public class Support extends Hero implements Heal {
    @Override
    public void heal() {
        System.out.println(getName() + "治疗");
    }
}
