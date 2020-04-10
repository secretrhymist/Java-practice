package controlString;
// 将首字母都大写输出
public class demo2 {
    public static void main(String[] args) {
        String sentence = "let there be light";
        String [] sen = sentence.split(" ");
        for(int i = 0; i < sen.length;i++) {
            sen[i] = sen[i].substring(0, 1).toUpperCase() + sen[i].substring(1);
            System.out.println(sen[i]);
        }

        String sentence2 = "";
        for(int i = 0;i < sen.length;i++){
            sentence2 += sen[i] + " ";
        }
        System.out.println(sentence2);

    }
}
