package projects_simplicity;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

public class java_坦克项目 extends JFrame{
        Mypanle2 my=null;
    public static void main(String[] args) {
        java_坦克项目 j=new java_坦克项目();
    }
    public java_坦克项目(){
        my=new Mypanle2();

        this.add(my);
        // 注册监听
        this.addKeyListener(my);

        this.setSize(500,300);
        this.setLocation(500,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
// 我的面板
class Mypanle2 extends JPanel implements KeyListener{

    // 定义一个我的坦克
    WdTank wdTank = null;

    // 定义敌方坦克
    Vector<DfTank> exs=new Vector<DfTank>();
    int Sizes=3;

    // 创建构造函数
    public Mypanle2() {
        wdTank = new WdTank(100, 100);
        // 创建敌人的坦克对象
        for (int i = 0; i < Sizes; i++) {
            DfTank bt=new DfTank((i+1)*50,0);
            exs.add(bt);
            bt.setFx(2);
            bt.setLb(1);
        }
    }

    public void paint(Graphics g) {

        super.paint(g);
        g.fillRect(0, 0, 500, 300);

        // 画出我的坦克 要改变坦克的颜色只要改变里ib的值（最后一个）
        this.QbTank(wdTank.getX(), wdTank.getY(), g,this.wdTank.Fx , 0);

        // 画出子弹
        if (wdTank.kh!=null){
            g.draw3DRect(wdTank.kh.x,wdTank.kh.y,1,1,false);
        }

        // 画出敌人的坦克
        for (int i = 0; i < exs.size(); i++) {
        this.QbTank(exs.get(i).getX(),exs.get(i).getY(),g,exs.get(i).getFx(),1);
        }
    }

    public void QbTank(int x, int y, Graphics g, int Fx, int lb) {
        // 判断是什么类型的坦克
        switch (lb) {
            case 0:
                g.setColor(Color.blue);
                break;
            case 1:
                g.setColor(Color.CYAN);
                break;
        }
        // 判断方向
        switch (Fx) {
            case 0:
                g.fill3DRect(wdTank.getX(), wdTank.getY(), 5, 30, false);
                g.fill3DRect(wdTank.getX() + 15, wdTank.getY(), 5, 30, false);
                g.fill3DRect(wdTank.getX() + 5, wdTank.getY() + 5, 10, 20, false);
                g.fillOval(wdTank.getX() + 5, wdTank.getY() + 10, 10, 10);
                g.drawLine(wdTank.getX() + 10, wdTank.getY() + 15, wdTank.getX() + 10, wdTank.getY());
                break;
            case 1:
                g.fill3DRect(wdTank.getX(), wdTank.getY(), 30, 5, false);
                g.fill3DRect(wdTank.getX(), wdTank.getY()+15, 30, 5, false);
                g.fill3DRect(wdTank.getX() + 5, wdTank.getY() + 5, 20, 10, false);
                g.fillOval(wdTank.getX() + 10, wdTank.getY() + 5, 10, 10);
                g.drawLine(wdTank.getX() + 15, wdTank.getY() + 10, wdTank.getX() + 30, wdTank.getY()+10);
                break;
            case 2:
                g.fill3DRect(wdTank.getX(), wdTank.getY(), 5, 30, false);
                g.fill3DRect(wdTank.getX() + 15, wdTank.getY(), 5, 30, false);
                g.fill3DRect(wdTank.getX() + 5, wdTank.getY() + 5, 10, 20, false);
                g.fillOval(wdTank.getX() + 5, wdTank.getY() + 10, 10, 10);
                g.drawLine(wdTank.getX() + 10, wdTank.getY() + 15, wdTank.getX() + 10, wdTank.getY()+30);
                break;
            case 3:
                g.fill3DRect(wdTank.getX(), wdTank.getY(), 30, 5, false);
                g.fill3DRect(wdTank.getX(), wdTank.getY()+15, 30, 5, false);
                g.fill3DRect(wdTank.getX() + 5, wdTank.getY() + 5, 20, 10, false);
                g.fillOval(wdTank.getX() + 10, wdTank.getY() + 5, 10, 10);
                g.drawLine(wdTank.getX() + 15, wdTank.getY() + 10, wdTank.getX() , wdTank.getY()+10);
                break;
        }
    }
    // 释放键盘
    public void keyTyped(KeyEvent e) {

    }
    // 按下键盘
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode()==KeyEvent.VK_W){
            this.wdTank.setFx(0);
            this.wdTank.Xs();

        }else if (e.getKeyCode()==KeyEvent.VK_D){
            this.wdTank.setFx(1);
            this.wdTank.Xy1();

        }else if (e.getKeyCode()==KeyEvent.VK_S){
            this.wdTank.setFx(2);
            this.wdTank.Xx();
        }else if (e.getKeyCode()==KeyEvent.VK_A){
            this.wdTank.setFx(3);
            this.wdTank.Xy2();
        }
        if (e.getKeyChar()==KeyEvent.VK_J){
            this.wdTank.Kaihuo();
        }
        this.repaint();
    }
    // 输出
    public void keyReleased(KeyEvent e) {

    }
}


// 坦克类
class Tank{
    // 坦克在的位置横坐标纵坐标
    int x=0;
    int y=0;
    // 定义坦克的方向 0表示上（w） 1表示右（d）2表示下（s）3表示左（a）
    int Fx=0;
    // 坦克的速度
    int Sd=3;
    // 坦克颜色0代表我方1跟2代表敌方
    int lb;

    public Tank(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int getLb(){
        return lb;
    }
    public void setLb(int lb){
        this.lb=lb;
    }
    public int getSd(){
        return Sd;
    }
    public void setSd(int Sd){
        this.Sd=Sd;
    }
    public int getFx(){
        return Fx;
    }
    public void setFx(int Fx){
        this.Fx=Fx;
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
// 开火
class Kaih{
    int x;
    int y;
    public Kaih(int x,int y){
        this.x=x;
        this.y=y;
    }
}


// 敌人坦克
class DfTank extends Tank{
    public DfTank(int x,int y){
        super(x,y);
    }
}

// 我的坦克
class WdTank extends Tank{

    Kaih kh=null;

    public WdTank(int x, int y) {
        super(x,y);
    }
    // 开火
    public void Kaihuo(){
        switch (this.Fx){
            case 0:
                kh=new Kaih(x+10,y);
                break;
            case 1:
                kh=new Kaih(x+30,y+10);
                break;
            case 2:
                kh=new Kaih(x+10,y+30);
                break;
            case 3:
                kh=new Kaih(x,y+10);
                break;
        }
    }

    // 坦克向上
    public void Xs(){
        y-=Sd;
    }
    // 坦克向右
    public void Xy1(){
        x+=Sd;
    }
    // 坦克向下
    public void Xx(){
        y+=Sd;
    }
    // 坦克向左
    public void Xy2(){
        x-=Sd;
    }
}
