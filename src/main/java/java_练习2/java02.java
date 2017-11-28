package java_练习2;

/**
 * Created by Administrator on 2017/11/12 0012.
 */
public class java02 implements A,B{     // 多实现
    public static void main(String[] args) {
        java02 q= new java02();
        q.shuo();
    }
    public void shuo() {
        System.out.println("小郭郭");
    }
}
interface A{
    public void shuo();
}
interface B{
    public void shuo();
}
