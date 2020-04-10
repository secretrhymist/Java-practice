package jiekou_jicheng;

public abstract class Animal {
    protected int legs;
    protected Animal(int leg){
        legs = leg;
    }
    public abstract void eat();
    public void walk(){
        if(legs>0)
            System.out.println("这种动物是用" + legs + "条腿行走的");
        else
            System.out.println("没有腿且不能走");
    }
}
