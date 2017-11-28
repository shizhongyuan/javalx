package projects_simplicity;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class java_监听事件 extends JFrame implements ActionListener{
    JPanel mp=null;
    JButton jb1=null;
    JButton jb2=null;
    public static void main(String[] args) {
    java_监听事件 j=new java_监听事件();
    }
    public java_监听事件(){
    mp=new JPanel();
    jb1=new JButton("黑色");
    jb2=new JButton("红色");

    this.add(jb1,BorderLayout.NORTH);
    mp.setBackground(Color.BLACK);
    this.add(mp);
    this.add(jb2,BorderLayout.SOUTH);

    // 注册监听
     jb1.addActionListener(this);
     jb1.setActionCommand("aa");
     jb2.addActionListener(this);
     jb2.setActionCommand("bb");

     this.setSize(300,200);
     this.setLocation(500,200);
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.setVisible(true);
    }
    // 监听事件点击时的反应
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("aa")){
            System.out.println("你点击黑色");
            mp.setBackground(Color.BLACK);
        }else if (e.getActionCommand().equals("bb")){
            System.out.println("你点击红色");
            mp.setBackground(Color.red);
        }else
            System.out.println("不知道");
    }
}
class myPanle extends JPanel{
    public void paint(Graphics g){
        super.paint(g);
    }
}
