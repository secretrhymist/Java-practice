package stream;

import java.io.File;

public class BianLiZiWenJan {
    public static void main(String[] args) {
        String path = "c:\\Windows";		//要遍历的路径
        File file = new File(path);		//获取其file对象
        showDir(file);
    }
    public static void showDir(File dir) {
        if(dir.exists()){
            //抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件和目录。
            File[] files = dir.listFiles();
            if(null!=files){
                for (int i = 0; i < files.length; i++) {
                    if (files[i].isDirectory()) {
                         showDir(files[i]);
                    } else {
                        System.out.println(files[i]);
                    }
                }
            }
        }else{
            System.out.println("文件不存在！");
        }

    }
}
