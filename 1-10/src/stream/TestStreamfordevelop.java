package stream;
//关闭流
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TestStreamfordevelop {
    public static void main(String[] args) {
        File f = new File("d:/lol.txt");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(f);
            byte[] all = new byte[(int) f.length()];
            fis.read(all);
            for (byte b : all) {
                System.out.println(b);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            // 在finally 里关闭流
            if (null != fis){
                try {
                    fis.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}
