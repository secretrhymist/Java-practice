package collection;

import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树排序
 */
public class Node {
    //左子节点
    public Node leftNode;
    //右子节点
    public Node rightNode;

    //值
    public Object value;

    //插入数据
    public void add(Object v){
        //如果当前节点没有值，就把数据放在当前节点上
        if(null == value)
            value = v;

        //如果当前节点有值，就进行判断，新增的值与当前值得大小
        else{
            //新增的值比当前值小或者相同

            if((Integer) v - (Integer) value <= 0){
                if(null == leftNode)
                    leftNode = new Node();
                leftNode.add(v);
            }
            //新增的值，比当前值打
            else{
                if(null == rightNode)
                    rightNode = new Node();
                rightNode.add(v);
            }
        }
    }

    public static void main(String[] args) {

        int randoms[] = new int[]{67, 7, 30, 73, 10, 0, 78, 81, 10, 74};

        Node roots = new Node();
        for (int number : randoms) {
            roots.add(number);
        }
    }

    public List<Object> values() {
        List<Object> values = new ArrayList<Object>();

        // 左节点的遍历结果
        if (null != leftNode)
            values.addAll(leftNode.values());
        // 当前节点
        values.add(value);

        // 右节点的遍历结果
        if (null != rightNode)
            values.addAll(rightNode.values());
        return values;
    }
}
