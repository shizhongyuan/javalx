package java_GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2017/11/27 0027.
 */
public class java_聊天界面 extends JFrame{
    JTextArea jta=null;
    JScrollPane jsp=null;
    JPanel jp=null;
    JComboBox jcb=null;
    JTextField jtf=null;
    JButton jb=null;
    public static void main(String[] args) {
        java_聊天界面 j=new java_聊天界面();
    }
    public java_聊天界面(){
        jta= new JTextArea();
        jsp=new JScrollPane(jta);
        jp=new JPanel();
        String []arr={"小黄","小兵","老翟"};
        jcb=new JComboBox(arr);
        jtf=new JTextField(20);
        jb=new JButton("发送");

        // 添加组件
        jp.add(jcb);
        jp.add(jtf);
        jp.add(jb);

        // 加入JFrame
        this.add(jsp);
        this.add(jp, BorderLayout.SOUTH);

        this.setTitle("聊天界面");
        this.setSize(400,400);
        this.setLocation(500,200);
//        this.setIconImage(new ImageIcon("..\\resources\\123.jpg"));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    private void setIconImage(ImageIcon imageIcon) {

    }
}
