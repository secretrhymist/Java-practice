package collection;
/**
 * 对这个HashMap进行反转，key变成value,value变成key
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PracticeCollection {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<String,String>();
        HashMap<String,String> temp = new HashMap<String,String>();
        map.put("adc","物理输出");
        map.put("apc","魔法输出");
        map.put("t","坦克");
        System.out.println("初始:" + map);
        //keyset 取出所有的key在keys内
        Set<String> keys = map.keySet();

        //遍历keys里的key  把key赋给value 之后在temp容器内颠倒
        for(String key:keys){
            String value = map.get(key);
            temp.put(value,key);
        }
        //清空map 之后重新放置
        map.clear();
        map.putAll(temp);
        System.out.println("反转后:" + map);

    }
}
