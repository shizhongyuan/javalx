package projects_simplicity;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class java_小球移动 extends JFrame{
        MyPanle1 mp=null;
    public static void main(String[] args) {
        java_小球移动 j=new java_小球移动();
    }
    public java_小球移动(){
        mp=new MyPanle1();

        this.add(mp);
        this.addKeyListener(mp);

        this.setSize(400,400);
        this.setLocation(500,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
class MyPanle1 extends JPanel implements KeyListener{

        int x=10;
        int y=10;
    public void paint(Graphics g){
        super.paint(g);
        g.fillOval(x,y,15,15);
    }
    // 按下键盘
    public void keyPressed(KeyEvent e) {
        // 向下
        if (e.getKeyCode()==KeyEvent.VK_DOWN){
            y+=5;
        }
        // 向上
        else if (e.getKeyCode()==KeyEvent.VK_UP){
            y-=5;
        }
        // 向左
        else if (e.getKeyCode()==KeyEvent.VK_LEFT){
            x-=5;
        }
        // 向右
        else if (e.getKeyCode()==KeyEvent.VK_RIGHT){
            x+=5;
        }
        this.repaint();

    }
    // 输出
    public void keyReleased(KeyEvent e) {

    }

    // 释放键盘
    public void keyTyped(KeyEvent e) {

    }
}
