package java_io;

/**
 * Created by Administrator on 2017/10/16 0016.
 */
public class java_多态 {
    public static void main(String[] args) {
        i2 p=new i1();
        p.zhu(99);
    }
}
class i1 extends i2{
    String x="小王";
    void zhu(int y){
        System.out.println(x+"====="+y);
    }
}
class i2{
    String x="小红";
    void zhu(int y){
        System.out.println(x+"----"+y);
    }
}
