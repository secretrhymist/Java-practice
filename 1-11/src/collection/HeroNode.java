package collection;

import charactor.Hero;

import java.util.ArrayList;
import java.util.List;

/**
 * 向这个英雄二叉树插入不同的Hero对象，并且按照Hero的血量倒排序。
 * 随机生成10个Hero对象，每个Hero对象都有不同的血量值
 * 插入这个HeroNode后，把排序结果打印出来。
 */
public class HeroNode {

    public HeroNode leftHero;
    public HeroNode rightHero;
    public Hero value;

    public void add(Hero v){
        if (null == value)
            value = v;
        else{
            if(v.hp > value.hp){
                if(null == leftHero)
                    leftHero = new HeroNode();
                leftHero.add(v);
            }
            else{
                if(null == rightHero)
                    rightHero = new HeroNode();
                rightHero.add(v);
            }
        }
    }

    public List<Hero> values(){
        List<Hero> values = new ArrayList<Hero>();

        if(null != leftHero)
            values.addAll(leftHero.values());
        values.add(value);

        if (null != rightHero)
            values.addAll(rightHero.values());
        return values;

    }

    public static void main(String[] args) {
        List<Hero> hs = new ArrayList<Hero>();
        for(int i = 0; i < 10;i++){
            Hero h = new Hero();
            h.name = "hero" + i;
            //100到1000的随机血量
            h.hp = (float)(Math.random() * 900 + 100);
            hs.add(h);
        }
        System.out.println("初始化10个Hero");
        System.out.println(hs);

        HeroNode heroTree = new HeroNode();
        for(Hero hero:hs){
            heroTree.add(hero);
        }
        System.out.println("根据血量倒序后的Hero");
        List<Hero> treeSortedHeros = heroTree.values();
        System.out.println(treeSortedHeros);
    }

}
