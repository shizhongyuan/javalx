package java_io流;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class io_读取 {
    public static void main(String[] args) throws IOException {
    io_读取 io=new io_读取();
    }
    public io_读取() throws IOException {
        File f=new File("E:\\java_io\\io13.tet");

        FileInputStream fis=new FileInputStream(f);
        byte []p=new byte[1024];
        int x=0;
        while ((x=fis.read(p))!=-1){
            String xx=new String(p,0,x);
            System.out.println(xx);
        }
        fis.close();
    }
}
