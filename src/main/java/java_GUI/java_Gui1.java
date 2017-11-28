package java_GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2017/11/22 0022.
 */
public class java_Gui1 extends JFrame{
    int sizz=10;
    JButton jb[]=new JButton[sizz];
    public static void main(String[] args) {
        java_Gui1 java_gui1=new java_Gui1();
    }
    public java_Gui1(){
        // 创建组件
        for (int x=1;x<sizz;x++){
            jb[x]=new JButton(String.valueOf(x));
        }
        // 设置布局管理器
        this.setLayout(new GridLayout(3,3,10,10));
        // 添加组件
        for (int i = 1; i < sizz; i++) {
            this.add(jb[i]);
        }
        // 标题
        this.setTitle("分布");
        // 布局的宽高 像素为单位
        this.setSize(400,400);
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
