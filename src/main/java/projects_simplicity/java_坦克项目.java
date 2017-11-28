package projects_simplicity;
import javax.swing.*;
import java.awt.*;

public class java_坦克项目 extends JFrame{
        Mypanle2 my=null;
    public static void main(String[] args) {
        java_坦克项目 j=new java_坦克项目();
    }
    public java_坦克项目(){
        my=new Mypanle2();
        this.add(my);
        this.setSize(500,300);
        this.setLocation(500,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
// 我的面板
class Mypanle2 extends JPanel {

    // 定义一个我的坦克
    WdTank wdTank = null;

    // 创建构造函数
    public Mypanle2() {
        wdTank = new WdTank(10, 20);
    }

    public void paint(Graphics g) {

        super.paint(g);
        // 画出我的坦克
        g.fillRect(0, 0, 500, 300);
        // 要改变坦克的颜色只要改变里ib的值（最后一个）
        this.QbTank(wdTank.getX(), wdTank.getY(), g, 0, 0);
    }

    public void QbTank(int x, int y, Graphics g, int di, int lb) {
        // 判断是什么类型的坦克
        switch (lb) {
            case 0:
                g.setColor(Color.blue);
                break;
            case 1:
                g.setColor(Color.CYAN);
                break;
            case 2:
                g.setColor(Color.GREEN);
                break;
        }
        // 判断方向
        switch (di) {
            case 0:
                g.fill3DRect(wdTank.getX(), wdTank.getY(), 5, 30, false);
                g.fill3DRect(wdTank.getX() + 15, wdTank.getY(), 5, 30, false);
                g.fill3DRect(wdTank.getX() + 5, wdTank.getY() + 5, 10, 20, false);
                g.fillOval(wdTank.getX() + 5, wdTank.getY() + 10, 10, 10);
                g.drawLine(wdTank.getX() + 10, wdTank.getY() + 15, wdTank.getX() + 10, wdTank.getY());
                break;
        }
    }
}

// 坦克类
class Tank{
    // 坦克在的位置横坐标纵坐标
    int x=0;
    int y=0;
    public Tank(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
}
// 我的坦克
class WdTank extends Tank{

    public WdTank(int x, int y) {
        super(x, y);
    }
}