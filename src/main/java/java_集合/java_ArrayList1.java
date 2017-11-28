package java_集合;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/11/19 0019.
 */
public class java_ArrayList1 {
    public static void main(String[] args) throws IOException {
            Gl g = new Gl();
//          Scanner s=new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("请选择你要操作的事件！！！");
            System.out.println("1表示添加一个员工");
            System.out.println("2表示打印员工的相关信息");
            System.out.println("3表示查看员工的全部信息");
            System.out.println("4表示修改员工的薪水");
            System.out.println("5表示删除员工的信息");
            System.out.println("退出按6");
            String s = br.readLine();
            if (s.equals("1")){
                System.out.println("请输入编号:");
                String h=br.readLine();
                System.out.println("请输入名字:");
                String name=br.readLine();
                System.out.println("请输入薪水:");
                float xs=Float.parseFloat(br.readLine());
                Yg y=new Yg(h,name,xs);
                g.addYg(y);
                System.out.println("添加成功");
            }
            else if (s.equals("2")){
                System.out.println("请输入要查看的员工部分信息编号：");
                String h=br.readLine();
                g.show(h);
            }
            else if (s.equals("3")){
                g.xssy();
            }
            else if (s.equals("4")){
                System.out.println("请输入要修改员工编号：");
                String h=br.readLine();
                System.out.println("请输入要修改的薪水：");
                float xs= Float.parseFloat(br.readLine());
                System.out.println("修改成功");
                g.xgai(h,xs);
            }
            else if (s.equals("5")){
                System.out.println("请输入你要删除的员工编号：");
                String h=br.readLine();
                g.shanchu(h);
                System.out.println("删除成功");
            }
            else if (s.equals("6")){
                break;
            }
        }
    }
}
// 管理员工类
class Gl{
    private ArrayList al=null;
    public Gl(){
        al=new ArrayList();
    }
    // 加入员工
    public void addYg(Yg yg){
        al.add(yg);
    }
    // 根据给的数打印员工的相关信息
    public void show(String h){
        for (int i = 0; i < al.size(); i++) {
            Yg y=(Yg) al.get(i);
            if (y.getH().equals(h)){
                System.out.println(" 名字:"+y.getName()+" 薪水为:"+y.getXs());
            }
        }
    }
    // 显示所有员工的信息
    public void xssy(){
        for (int i = 0; i < al.size(); i++) {
            Yg y=(Yg) al.get(i);
            System.out.println("编号:"+y.getH()+" 名字:"+y.getName()+" 薪水:"+y.getXs());
        }
    }
    // 修改员工的薪水
    public void xgai(String h,float newxs){
        for (int i = 0; i < al.size(); i++) {
            Yg y=(Yg) al.get(i);
            if (y.getH().equals(h)){
                y.setXs(newxs);
            }
        }
    }
    // 删除员工的信息
    public void shanchu(String h){
        for (int i = 0; i < al.size(); i++) {
            Yg y=(Yg) al.get(i);
            if (y.getH().equals(h)){
                al.remove(i);
            }
        }
    }
}
// 员工类
class Yg{
    private String h;
    private String name;
    private float xs;
    public Yg(String h,String name, float xs){
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

