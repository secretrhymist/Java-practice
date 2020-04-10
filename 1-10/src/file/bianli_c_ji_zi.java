package file;
import java.io.File;
import java.io.FileFilter;

public class bianli_c_ji_zi {
    public static void main(String[] args) {
        String path = "c:\\Windows";		//要遍历的路径
        File file = new File(path);		//获取其file对象
        func(file);
    }

    private static void func(File file){
        File[] fs = file.listFiles();
        if(file != null) {
            for (File f : fs) {
                if (f.isDirectory())    //若是目录，则递归打印该目录下的文件
                    func(f);
                else {
                    System.out.println(f);
                }
                //            if(f.isFile())		//若是文件，直接打印
                //                System.out.println(f);
            }
        }
        else {
            System.out.println("文件不存在！");
        }
    }
}



/**
NullPointerException  空指针异常
 对象未初始化或为空
 **/
