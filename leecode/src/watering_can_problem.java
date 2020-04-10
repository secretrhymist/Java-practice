/**
题目
 有两个容量分别为 x升和 y升的水壶以及无限多的水。请判断能否通过使用这两个水壶，从而可以得到恰好 z升的水？
 如果可以，最后请用以上水壶中的一或两个来盛放取得的 z升 水。
 你允许：
 装满任意一个水壶
 清空任意一个水壶
 从一个水壶向另外一个水壶倒水，直到装满或者倒空

解题思路：
裴蜀定理：对任何整数a、b和它们的最大公约数d，关于未知数x和y的线性不定方程（称为裴蜀等式）：
若a,b是整数,且（a,b)=d，那么对于任意的整数x,y,ax+by都一定是d的倍数，特别地，一定存在整数x,y，使ax+by=d成立。
它的一个重要推论是：a,b互质的充要条件是存在整数x,y使ax+by=1.

**/
//算法一
public class watering_can_problem {
//    public static boolean canMeasureWater(int x, int y, int z) {
//        if (x + y < z) return false;
//        if (x == z || y == z || x + y == z) return true;
//        return z % gcd(x, y) == 0;
//    }
//
//    public static int gcd(int a, int b) {
//        if (b == 0) return a;
//        return gcd(b, a % b);
//    }
//
    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }

/**
     * 算法设计二:
     * 1、如果水壶X的容量等于Z，或者水壶Y的容量等于Z，或者水壶X+水壶Y的容量等于Z，则返回true；
     * 2、如果水壶Y中当前水的容量等于Z，或者水壶X中当前水的容量+水壶Y中当前水的容量等于Z，则返回true；
     *   （因为假设水壶Y的容量大，使用尝试用水壶Y尽可能多装水。）
     * 3、
     *
     *
 **/
    public static boolean canMeasureWater(int x, int y, int z) {
        //假设水壶Y的容量大于水壶X
        if (x > y) swap(x, y);
        if (x == z || y == z || x + y == z) return true;   //specific cases
        int currX = x;   //current water amount in smaller jug
        int currY = x;   //current water amount in larger jug
        if (x != 0 && y != 0) {
            while (true) {
                //如果当前水壶Y的水量等于Z或者 当前水壶X和Y的水量之和等于Z，则返回true
                if (currY == z || currX + currY == z) return true;
                if (y - currY == currX) break;
                else if (y - currY > currX) {
                    currY = currY + currX;
                    currX = x;
                } else {
                    currX = currX - (y - currY);
                    currY = 0;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        boolean flag = canMeasureWater(3, 4, 5);
        //boolean flag=canMeasureWater(2,6,5);
        System.out.println(flag);
    }
}



