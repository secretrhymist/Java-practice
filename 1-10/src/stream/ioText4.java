package stream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
public class ioText4 {
    public static void encodeFile(File encodingFile, File encodedFile) {
        try (FileReader fr = new FileReader(encodingFile); FileWriter fw = new FileWriter(encodedFile)){
            //创建字符数组，长度就是文件的长度
            char[] all = new char[(int) encodingFile.length()];
            fr.read(all);
            for(int i = 0;i < all.length; i++){
                if(Character.isDigit(all[i])){
                    if(all[i] > '0')
                        all[i] -= 1;
                    else
                        all[i] += 9;
                }
                if(Character.isLowerCase(all[i])){
                    if(all[i] < 'z')
                        all[i] += 1;
                    else
                        all[i] -= 25;
                }
                if(Character.isUpperCase(all[i])) {
                    if(all[i]<'Z')
                        all[i]+=1;
                    else
                        all[i]-=25;
                }
            }
            fw.write(all);
        }catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        File h1=new File("E:/Case/File 1-4/floor1-1/floor2/floor3/1.txt");
        File h2=new File("E:/Case/File 1-4/floor1-1/floor2/floor3/2.txt");
//        File h3=new File("d:/xyz/abc/def/3.txt");
        encodeFile(h1, h2);
//        decodeFile(h2, h3);
    }
}

 **/