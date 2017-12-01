package java_io流;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
public class io_记事本开发 extends JFrame implements ActionListener{
        // 添加插件
        JTextArea jta=null;
        // 添加菜单条
        JMenuBar jmb=null;
        // 第一JMenu
        JMenu jm=null;
        // JMenuItem
        JMenuItem jmi=null;
        JMenuItem jmi1=null;
        JMenuItem jmi2=null;
    public static void main(String[] args) {
        io_记事本开发 io=new io_记事本开发();
    }
    public io_记事本开发(){
        jta=new JTextArea();
        jmb=new JMenuBar();
        jm=new JMenu("菜单");
        // 设置助记符
        jm.setMnemonic('F');
        jmi=new JMenuItem("打开文件");
        // 注册监听
        jmi.addActionListener(this);
        jmi.setActionCommand("ok");

        jmi1=new JMenuItem("保存");
        // 注册监听
        jmi1.addActionListener(this);
        jmi1.setActionCommand("ok1");

        jmi2=new JMenuItem("退出");
        // 注册监听
        jmi2.addActionListener(this);
        jmi2.setActionCommand("ok2");

        // 加入
        this.setJMenuBar(jmb);
        // jm放入jmb
        jmb.add(jm);
        jm.add(jmi);
        jm.add(jmi1);
        jm.add(jmi2);

        this.add(jta);
        this.setSize(500,400);
        // 显示的位置 像素为单位
        this.setLocation(500,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
    if (e.getActionCommand().equals("ok")){
        // 打开文件的类
        JFileChooser jfc=new JFileChooser();
        // 设置名字
        jfc.setDialogTitle("选择文件");
        // 默认方式
        jfc.showOpenDialog(null);
        // 显示
        jfc.setVisible(true);
        // 知道用户选择文件的路径
        String s = jfc.getSelectedFile().getAbsolutePath();

        // 使用字符流显示文件内容
        FileReader fr=null;
        // 添加缓存区
        BufferedReader br=null;
        try {
            fr=new FileReader(s);
            br=new BufferedReader(fr);
            // 知道文件了就要显示到jta中
            String x="";
            String xx="";
            while ((x=br.readLine())!=null){
                xx+=x+"\r\n";
            }
            // 显示到jta中
            jta.setText(xx);
        } catch (Exception e1) {
            e1.printStackTrace();
        }finally {
            try {
                br.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }else if (e.getActionCommand().equals("ok1")){
        // 打开文件的类
        JFileChooser jfc=new JFileChooser();
        // 设置名字
        jfc.setDialogTitle("另存为");
        // 按默认方式显示
        jfc.showSaveDialog(null);
        // 显示
        jfc.setVisible(true);
        // 知道用户选择文件的路径
        String s1 = jfc.getSelectedFile().getAbsolutePath();
        FileWriter fw=null;
        BufferedWriter bw=null;
        try {
            fw=new FileWriter(s1);
            bw=new BufferedWriter(fw);

            bw.write(this.jta.getText());
        } catch (IOException e1) {
            e1.printStackTrace();
        }finally {
            try {
                bw.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }else if (e.getActionCommand().equals("ok2")){
        // 退出
        System.exit(0);
    }
    }
}
