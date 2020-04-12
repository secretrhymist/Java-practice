package collection;

import java.util.ArrayList;

/**
 * 做一个一样的MyStringBuffer练习，但是不使用字符数组，而是使用ArrayList来实现
 */

public class PracticeCollection2 implements IsStringBuffer{
    ArrayList list = new ArrayList();
    public void append(String str){
        if(str == null){
            return;
        }
        list.add(str);
    }
    public void append(char c){
        list.add(c);
    }
    public void insert(int pos,char b){
        if(pos < 0|| pos > list.size()){
            return;
        }
        list.add(pos,b);
    }

    public void insert(int pos, String b) {

        if (pos < 0 || pos > list.size()) {
            return;
        } else {
            list.add(pos, b);
        }
    }

    public void delete(int start) {
        delete(start, list.size());
    }

    public void delete(int start,int end){
        if(start < 0||start > list.size()||start > end){
            return;
        }else if(end > list.size()){
            return;
        }else{
            for(int i = start; i < end; i++){
                list.remove(start);
            }
        }
    }

/**
    public void reverse(){
        for(int i = 0; i < list.size()/2;i++){
            char temp = (char)list.get(i);
            list.set(i,list.get(list.size() - 1 - i));
            list.set(list.size() - i - 1,temp);
        }
    }
**/

    public int length(){
        return list.size();
    }

    public static void main(String[] args) {
        PracticeCollection2 t = new PracticeCollection2();

        t.append('1');
        t.append('2');
        t.append('3');
        t.append("45");
        System.out.println("加入数字后：" + t.list.toString());

        t.delete(3);
        System.out.println("删除3位置往后的：" + t.list.toString());

        t.delete(1,2);
        System.out.println("删除1到2位置（2位置取不到）：" + t.list.toString());

        t.append('1');
        t.append('2');
        t.append('3');
        System.out.println("加入后一些新的数后：" + t.list.toString());

//        t.reverse();
//        System.out.println("反转：" + t.list.toString());

        System.out.println(t.length());
    }
}
