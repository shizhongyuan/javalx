package java_io流;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class io_拷贝 {
    public static void main(String[] args) throws IOException {
        io_拷贝 io=new io_拷贝();
    }
    public io_拷贝() throws IOException {
        FileInputStream fis=null;
        FileOutputStream fos=null;
        fis=new FileInputStream("E:\\java_io\\io14.tet");
        fos=new FileOutputStream("E:\\java_io\\io15.tet");
        int x=0;
        byte [] xx=new byte[1024];
        while ((x=fis.read(xx))!=-1){
         fos.write(xx);
        }
        fos.close();
        fis.close();
    }
}
