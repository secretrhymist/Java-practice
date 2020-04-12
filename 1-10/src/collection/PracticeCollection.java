package collection;

import charactor.Hero;

import java.util.ArrayList;

public class PracticeCollection {
    public static void main(String[] args) {
        ArrayList heros = new ArrayList();
        for(int i = 0;i < 5;i++){
            heros.add(new Hero("hero" + i));
        }
        Hero[] name = (Hero[]) heros.toArray(new Hero[]{});
        for(Hero h:name){
            if(h.name.equals("hero1")){
                System.out.println("找到了名字hero1,下标为" + heros.indexOf(h));
            }
        }
    }
}
