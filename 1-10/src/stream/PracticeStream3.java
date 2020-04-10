package stream;
//将200多个视频文件合并在一起！
import java.io.*;

public class PracticeStream3 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("E:/Case/File 1-2/gb_con_union.mp4");
        //buffer 为字节缓冲区
        byte[] buffer = new byte[1024];
        //字节输入流
        FileInputStream fis = null;
        //字节输出流
        FileOutputStream fos = new FileOutputStream(file);
        //遍历拆分的文件，对每一个文件，写入到目标文件内
        for(int i= 0;i < 255;i++){
            File tempFile = new File("E:/Case/File 1-2/gb_con" + i + ".mp4");
            int len = 0;
            try{
                //文件字节输入流
                fis = new FileInputStream(tempFile);
                while((len=fis.read(buffer))!=-1){
                    fos.write(buffer,0,len); //写入数据到目的文件中
                    fos.flush();
                }
                System.out.println("已经合并文件的个数为" + (i+1));
                fis.close();  //只有当文件字节输入流关闭时，也就是不对该文件进行操作时才能删除文件
                //全部写完删除该文件
                boolean flag=tempFile.delete();
                System.out.println("删除文件 "+flag);

            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
        try{
            assert fis != null;
            fis.close();
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
