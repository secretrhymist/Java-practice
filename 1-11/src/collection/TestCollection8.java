package collection;

import charactor.Hero;

import java.util.HashMap;

/**
 * 对于HashMap而言，key是唯一的，不可以重复的。
 * 所以，以相同的key 把不同的value插入到 Map中会导致旧元素被覆盖，只留下最后插入的元素。
 * 不过，同一个对象可以作为值插入到map中，只要对应的key不一样
 *
 * key是唯一的，但是value值可以一样
 */

public class TestCollection8 {
    public static void main(String[] args) {
        HashMap<String, Hero> heroMap = new HashMap<String, Hero>();
        heroMap.put("gareen",new Hero("gareen1"));
        System.out.println(heroMap);

        heroMap.put("gareen",new Hero("gareen2"));
        System.out.println(heroMap);

        heroMap.clear();
        Hero gareen = new Hero("gareen");

        heroMap.put("hero1",gareen);
        heroMap.put("hero2",gareen);

        System.out.println(heroMap);

    }
}
