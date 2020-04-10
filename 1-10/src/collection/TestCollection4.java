package collection;

import charactor.Hero;

import java.util.ArrayList;

public class TestCollection4 {
    public static void main(String[] args) {
        ArrayList heros = new ArrayList();

        for(int i = 0;i < 5;i++){
            heros.add(new Hero("hero" + i));
        }
        System.out.println("ArrayList heros:\t" + heros);

        //把另一个容器里所有的元素都加入到该容器中
        ArrayList anotherHeros = new ArrayList();
        anotherHeros.add(new Hero("hero a"));
        anotherHeros.add(new Hero("hero b"));
        anotherHeros.add(new Hero("hero c"));
        System.out.println("anotherHeros heros:\t" + anotherHeros);
        heros.addAll(anotherHeros);
        System.out.println("把另一个ArrayList的元素都加入到当前ArrayList:");
        System.out.println("ArrayList heros:\t" + heros);

    }
}
