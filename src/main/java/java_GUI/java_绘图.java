package java_GUI;
import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2017/11/27 0027.
 */
public class java_绘图 extends JFrame{
        MyPanle mp=null;
    public static void main(String[] args) {
        java_绘图 j=new java_绘图();
    }
    public java_绘图(){
        mp=new MyPanle();

        this.add(mp);

        this.setSize(400,400);
        this.setLocation(500,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
class MyPanle extends JPanel{
        // 系统自动调用paint方法
    public void paint(Graphics g){
        // 调用父类函数初始化
        super.paint(g);
        // 画出一个圆
//        g.drawOval(10,10,30,30);
//        g.setColor(Color.BLUE);
//        g.fillRect(20,20,40,40);
        // 画出一张相片
        Image im=Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/src/test/123.jpg"));
        g.drawImage(im,20,20,200,150,this);
    }
}
