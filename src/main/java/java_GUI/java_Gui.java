package java_GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2017/11/22 0022.
 */
public class java_Gui extends JFrame{
    JButton jb1,jb2,jb3,jb4;
    public static void main(String[] args) {
        java_Gui java_gui=new java_Gui();
    }
    public java_Gui(){
        jb1=new JButton("小黄");
        jb2=new JButton("小兵");
        jb3=new JButton("小乐");
        jb4=new JButton("小翟");
        // 添加插件  注类要继承JFrame
        this.add(jb1);
        this.add(jb2);
        this.add(jb3);
        this.add(jb4);
        // 设置布局管理器
        this.setLayout(new FlowLayout(FlowLayout.LEADING));
        // 标题
        this.setTitle("分布");
        // 布局的宽高 像素为单位
        this.setSize(400,300);
        // 不可改变框体的大小
        this.setResizable(false);
        // 显示的位置 像素为单位
        this.setLocation(500,200);
        // 点叉的时候退出程序
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 显示
        this.setVisible(true);
    }
}
