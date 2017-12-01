package java_io流;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Administrator on 2017/11/30 0030.
 */
public class io_写入 {
    public static void main(String[] args) throws IOException {
        io_写入 io=new io_写入();
    }
    public io_写入() throws IOException {
        File f=new File("E:\\java_io\\io14.tet");
        FileOutputStream fos=null;
        String x="我们不一样001";
        if (!f.exists()){
            f.createNewFile();
            fos=new FileOutputStream(f);
            fos.write(x.getBytes());
        }
        else {
            fos = new FileOutputStream(f);
            fos.write(x.getBytes());
        }
        fos.close();
    }
}
