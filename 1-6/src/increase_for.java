public class increase_for {
    public static void main(String[] args) {
        int values[] = new int[]{18,62,68,82,65,9};
//        常规遍历
//        for (int i = 0; i < values.length; i++) {
//            int each = values[i];
//            System.out.println(each);
//        }
        int max = 0;
//        增强型for循环遍历
        for (int each : values) {
            if(each > max)
                max = each;
        }
        System.out.println(max);
    }
}
