public class erzi extends fuqin {
    public static void main(String[] args) {
        erzi a = new erzi();
        a.name = "布甲";
        a.ac = 15;
        a.price = 300;
        erzi b = new erzi();
        b.name = "锁甲";
        b.ac = 55;
        b.price = 500;
        System.out.println(a.name + "\t" + a.price +"\t" + a.ac);
        System.out.println(b.name + "\t" + b.price +"\t" + b.ac);
    }
}
