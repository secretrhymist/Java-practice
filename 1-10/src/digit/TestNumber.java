package digit;

public class TestNumber {
    public static void main(String[] args) {
        String name = "gay";
        int kill = 8;
        String title = "超神";
        String sentenceFormat = "%s进行了%d次击杀,获得了%s的称号%n";
        System.out.printf(sentenceFormat,name,kill,title);
        System.out.format(sentenceFormat,name,kill,title);
    }
}
