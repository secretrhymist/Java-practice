package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//找到一个大于100k的文件，按照100k为单位，
// 拆分成多个子文件，并且以编号作为文件名结束。
public class PracticeStream2 {
    public static void main(String[] args) throws IOException {
        File f = new File("E:/Case/File 1-1/gb_con.mp4");
        FileInputStream fs = null;

        fs = new FileInputStream(f);

        byte[] byteArr = new byte[(int) f.length()];

        fs.read(byteArr);
        fs.close();

        for(int i = 0;i <= byteArr.length/102400;i++){
            File f2 = new File("E:/Case/File 1-1/gb_con" + i + ".mp4");
            f2.createNewFile();

            FileOutputStream fs1 = new FileOutputStream(f2);
            if(byteArr.length < 102400){
                fs1.write(byteArr);
            }
            else{
                for(int j = 102400 * i;j < byteArr.length;j++){
                    fs1.write(byteArr[j]);
                    if((j + 1) % 102400 == 0){
                        break;
                    }
                }
            }
            fs1.close();
        }
    }
}
