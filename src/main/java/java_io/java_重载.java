package java_io;

/**
 * Created by Administrator on 2017/10/17 0017.
 */
public class java_重载 {
    public static void main(String[] args) {
        czai p=new czai("老三",28);
        p.zhu();
    }
}
class czai{
    String x;
    int y;
    czai(String x,int y){
    this.x=x;
    this.y=y;
    }
    public void zhu(){
        System.out.println(x+"     "+y);
    }
}
