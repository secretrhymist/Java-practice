package collection;
/**
 * 准备一个ArrayList其中存放3000000(三百万个)Hero对象，
 * 其名称是随机的,格式是hero-[4位随机数]
 * hero-3229
 * hero-6232
 * hero-9365
 * ...
 *
 * 因为总数很大，所以几乎每种都有重复，把名字叫做 hero-5555的所有对象找出来
 * 要求使用两种办法来寻找
 * 1. 不使用HashMap，直接使用for循环找出来，并统计花费的时间
 * 2. 借助HashMap，找出结果，并统计花费的时间
 */

import charactor.Hero;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PracticeCollcetion1 {
    public static void main(String[] args) {
        List<Hero> arr1 = new ArrayList<Hero>();
        System.out.println("初始化开始");
        for (int i = 0; i < 3000000; i++) {
            Hero h = new Hero("hero-" + random());
            arr1.add(h);
        }
        HashMap<String,List<Hero>> heroMap = new HashMap<String, List<Hero>>();
        for(Hero h:arr1){
            List<Hero> list = heroMap.get(h.name);
            if(list == null){
                list = new ArrayList<Hero>();
                heroMap.put(h.name,list);
            }
            list.add(h);
        }
        System.out.println("初始化结束");
        System.out.println("开始查找");
        findByIteration(arr1);
        findByMap(heroMap);

    }

    //取了个别名m
    private static List<Hero> findByMap(HashMap<String,List<Hero>> m){
        long start = System.currentTimeMillis();
        List <Hero> result = m.get("hero-5555");
        long end = System.currentTimeMillis();
        System.out.printf("通过map查找，一共找到%d个英雄，耗时%d 毫秒%n",result.size(),end-start);
        return result;
    }

    private static List<Hero> findByIteration(List<Hero> arr1){
        long start = System.currentTimeMillis();
        List<Hero> result = new ArrayList<Hero>();
        for(Hero h:arr1){
            if(h.name.equals("hero-5555")){
                result.add(h);
            }
        }
        long end = System.currentTimeMillis();
        System.out.printf("通过for查找，一共找到%d个英雄，耗时%d 毫秒%n", result.size(),end-start);
        return result;


    }
    public static int random(){
        return ((int)(Math.random()*9000)+1000);
    }

}


