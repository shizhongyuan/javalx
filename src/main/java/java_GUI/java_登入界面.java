package java_GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2017/11/26 0026.
 */
public class java_登入界面 extends JFrame{
    // 添加组件
    JPanel jp1,jp2,jp3;     // 排列
    JLabel jl1,jl2;         // 文本
    JButton jb1,jb2;        // 按钮
    JTextField jtf1;        // 帐号框
    JPasswordField jpf1;    // 密码框
    public static void main(String[] args){
        java_登入界面 j=new java_登入界面();
    }
    public java_登入界面(){
        jp1=new JPanel();
        jp2=new JPanel();
        jp3=new JPanel();

        jl1=new JLabel("帐号：");
        jl2=new JLabel("密码：");

        jb1=new JButton("登入");
        jb2=new JButton("取消");


        jtf1=new JTextField(10);
        jpf1=new JPasswordField(10);

        // 设置布局管理
        this.setLayout(new GridLayout(3,1));

        // 加入插件
        jp1.add(jl1);
        jp1.add(jtf1);

        jp2.add(jl2);
        jp2.add(jpf1);

        jp3.add(jb1);
        jp3.add(jb2);

        this.add(jp1);
        this.add(jp2);
        this.add(jp3);

        this.setSize(300,150);
        // 显示的位置 像素为单位
        this.setLocation(500,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
