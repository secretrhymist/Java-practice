package controlString;

//把 lengendary 改成间隔大写小写模式，即 LeNgEnDaRy

public class demo4 {
    public static void main(String[] args) {
        String word = "lengendary";
        for(int i = 0;i < word.length();i++){
            if(i % 2 == 0)
                continue;
            char c = Character.toUpperCase(word.charAt(i-1));
            char d = word.charAt(i);
            System.out.print(c + "" + d);
        }
    }
}
