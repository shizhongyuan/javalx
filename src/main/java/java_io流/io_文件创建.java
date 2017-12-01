package java_io流;

import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2017/11/30 0030.
 */
public class io_文件创建 {
    public static void main(String[] args) throws IOException {
        io_文件创建 io=new io_文件创建();
    }
    public io_文件创建() throws IOException {
        // 如果没有该文件创建 有返回有该文件
        File f=new File("E:\\java_io\\io13.tet");
        if (!f.exists()){
            f.createNewFile();
            System.out.println("创建成功");
        }
        else
            System.out.println("有该文件");
    }
}
