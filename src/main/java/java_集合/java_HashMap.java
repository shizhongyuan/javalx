package java_集合;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by Administrator on 2017/11/19 0019.
 */
public class java_HashMap {
    public static void main(String[] args) {
        HashMap hm=new HashMap();
        Y y1=new Y("s001","aa",1200);
        Y y2=new Y("s002","bb",1300);
        Y y3=new Y("s003","cc",1500);
        hm.put("s001",y1);
        hm.put("s002",y2);
        hm.put("s003",y3);
        if (hm.containsKey("s002")){
            Y y=(Y) hm.get("s002");
            System.out.println("有该员工");
            System.out.println("员工薪水为："+y.getXs());
        }else {
            System.out.println("没有该员工");
        }

        // HashMap集合的遍历  缺陷就是遍历出来的不按先后
        Iterator it=hm.keySet().iterator();
        while(it.hasNext()){
            String s = it.next().toString();
            Y y=(Y) hm.get(s);
            System.out.println("名字为："+y.getName());
            System.out.println("薪水为："+y.getXs());
        }
    }
}
class Y{
    private String h;
    private String name;
    private float xs;
    public Y(String h,String name, float xs){
        this.h=h;
        this.name=name;
        this.xs=xs;
    }
    public String getH(){
        return h;
    }
    public void setH(String h){
        this.h=h;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public float getXs(){
        return xs;
    }
    public void setXs(float xs){
        this.xs=xs;
    }
}
