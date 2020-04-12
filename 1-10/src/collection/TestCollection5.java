package collection;

import charactor.Hero;

import java.util.ArrayList;
import java.util.List;

public class TestCollection5 {
    public static void main(String[] args) {
        //ArrayList实现了接口List

        //常见的写法会把引用声明为接口List类型
        //注意：是java.util.List,而不是java.awt.List
        //接口引用指向子类对象（多态）

        List heros = new ArrayList();
        heros.add( new Hero("盖伦"));
        heros.add( new Hero("盖伦2"));
        System.out.println(heros.size());

    }
}
