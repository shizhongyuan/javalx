package projects_simplicity;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class java_鼠标事件 extends JFrame{
        MyPanle3 mp=null;
    public static void main(String[] args) {
        java_鼠标事件 j=new java_鼠标事件();
    }
    public java_鼠标事件(){
        mp=new MyPanle3();

        this.add(mp);
        this.addMouseListener(mp);
        this.addMouseMotionListener(mp);

        this.setSize(400,400);
        this.setLocation(500,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
class MyPanle3 extends JPanel implements MouseListener,MouseMotionListener{
    public void paint(Graphics g){
        super.paint(g);
    }
    // 鼠标点击
    public void mouseClicked(MouseEvent e) {
        System.out.println("x="+e.getX()+" y="+e.getY());
    }
    // 鼠标按下
    public void mousePressed(MouseEvent e) {

    }
    // 鼠标松开
    public void mouseReleased(MouseEvent e) {

    }
    // 鼠标进入
    public void mouseEntered(MouseEvent e) {
        System.out.println("鼠标进入");
    }
    // 鼠标离开
    public void mouseExited(MouseEvent e) {
        System.out.println("鼠标离开");
    }
    // 鼠标拖拽
    public void mouseDragged(MouseEvent e) {

    }
    // 鼠标移动
    public void mouseMoved(MouseEvent e) {
        System.out.println("x="+e.getX()+" y="+e.getY());
    }
}
