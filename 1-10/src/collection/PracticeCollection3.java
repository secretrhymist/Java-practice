package collection;

import charactor.GiantDragon;
import charactor.Hero;
import charactor.LOL;
import property.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * 借助泛型和前面学习的面向对象的知识，设计一个ArrayList，
 * 使得这个ArrayList里，又可以放Hero，又可以放Item,但是除了这两种对象，其他的对象都不能放
 */
public class PracticeCollection3{
    public static void main(String[] args) {
        List<LOL> lolList = new ArrayList<LOL>();
        lolList.add(new Hero("提莫"));
        lolList.add(new Item("纳什之牙"));
//        lolList.add(new GiantDragon("龙鸭"));
        System.out.println(lolList);

    }
}