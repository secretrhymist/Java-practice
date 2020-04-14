package collection;

import java.util.HashMap;

/**
 * Hashmap存储数据的方式：键值对
 */
public class TestCollection7 {
    public static void main(String[] args) {
        HashMap<String,String> dictionary = new HashMap<String, String>();
        dictionary.put("adc","物理");
        dictionary.put("apc","魔法");
        dictionary.put("T","坦克");

        System.out.println(dictionary.get("T"));
    }


}
