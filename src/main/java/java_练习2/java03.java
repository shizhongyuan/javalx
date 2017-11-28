package java_练习2;

import java.util.Enumeration;

/**
 * Created by Administrator on 2017/11/14 0014.
 */
public class java03 {
    public static void main(String[] args) {
        Zhu01 q=new Zhu01(2.2,2.8);
        q.zhu();
    }
}
interface Zhu{
    public void zhu();
}
class Zhu01 implements Zhu{
    double x;
    double y;
    Zhu01(double x,double y){
        if (x<0 || y<0){

        }
        this.x=x;
        this.y=y;
    }
    public void zhu() {
        double i = x * y;
        System.out.println("i="+i);
    }
}