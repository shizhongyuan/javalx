package java_集合;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/11/19 0019.
 */
public class java_ArrayList {
    public static void main(String[] args) {
        // 集合类
        ArrayList al=new ArrayList();
        // 创建一个对象
        Zy zy1=new Zy("张三",20,2000);
        Zy zy2=new Zy("李四",28,5000);
        Zy zy3=new Zy("三八",38,3800);
        // 将对象数加载到集合类中  添加
        al.add(zy1);
        al.add(zy2);
        al.add(zy3);

        // 打印集合的大小
        // System.out.println("al集合的大小："+al.size());
        // 打印集合中的名字  遍历
        System.out.println("删除前:");
        for (int i = 0; i < al.size(); i++) {
            Zy m = (Zy) al.get(i);
            System.out.println("名字是："+m.getName()+" "+m.getAgs()+" "+m.getXs());
        }
        // 将对象数从集合中删除  删除
        al.remove(2);

        System.out.println("删除后:");
        for (int i = 0; i < al.size(); i++) {
            Zy m = (Zy) al.get(i);
            System.out.println("名字是："+m.getName()+" "+m.getAgs()+" "+m.getXs());
        }

    }
}
class Zy{
    private String name;
    private int ags;
    private float xs;
    public Zy(String name, int ags, float xs){
        this.name=name;
        this.ags=ags;
        this.xs=xs;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAgs(){
        return ags;
    }
    public void setAgs(int ags){
        this.ags=ags;
    }
    public float getXs(){
        return xs;
    }
    public void setXs(float xs){
        this.xs=xs;
    }
}
