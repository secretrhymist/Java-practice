package collection;

import charactor.APHero;
import charactor.Hero;
import property.Item;

import java.util.ArrayList;
import java.util.List;

public class TestCollection6 {
    public static void main(String[] args) {

        //对于不使用泛型的容器，可以往里面放英雄，也可以往里面放物品
        List heros = new ArrayList();
        heros.add(new Hero("盖伦"));

        heros.add(new Item("红叉"));

        //对象转型会出现问题
        Hero h1=  (Hero) heros.get(0);
        //尤其是在容器里放的对象太多的时候，就记不清楚哪个位置放的是哪种类型的对象了
//        Hero h2=  (Hero) heros.get(1);

        //引入泛型Generic
        //生命容器的时候,就指定该容器只能放Hero,放其他的就会出错
        List<Hero> genericheros = new ArrayList<Hero>();
        genericheros.add(new Hero("gay伦"));

        //Item之类的就放不了了

        //此外可以放Hero的子类
        genericheros.add(new APHero());

        //并且在取出数据的时候，不需要再进行转型了，因为里面肯定是放的Hero或者其子类
        Hero h = genericheros.get(0);

    }
}
