package collection;

import charactor.Hero;

import java.util.ArrayList;
import java.util.List;

public class PracticeCollection4 {
    public static void main(String[] args) {
        List<Hero> heros = new ArrayList<Hero>();
        for(int i = 0; i < 100;i++){
            heros.add(new Hero("hero " + i));
        }

        List<Hero> deleteHeros = new ArrayList<Hero>();
        for (Hero h : heros) {
            int id = Integer.parseInt(h.name.substring(5));
            if (0 == id % 8)
                deleteHeros.add(h);
        }
        for (Hero h : deleteHeros) {
            heros.remove(h);
        }
//      heros.removeAll(deletingHeros); //直接通过removeAll删除多个Hero对象
        System.out.println(heros);
    }
//        for(int i = 0;i <heros.size();i++){
//            if(i % 8 == 0){
//                continue;
//            }
//            heros.add(new Hero("hero" + i));
//        }
//        System.out.println(heros);
//    }
}
