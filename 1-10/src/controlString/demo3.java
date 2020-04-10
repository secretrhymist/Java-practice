package controlString;
/**
 peter piper picked a peck of pickled peppers
 统计这段绕口令有多少个以p开头的单词
 **/
public class demo3 {
    public static void main(String[] args) {
        String sentence = "peter piper picked a peck of pickled peppers";
        String[] sen = sentence.split(" ");
        int count = 0;
        for(int i = 0;i < sen.length;i++){
            if(sen[i].substring(0,1).equals("p")){
                count += 1;
            }else{
                continue;
            }
        }
        System.out.println(count);
    }
}
