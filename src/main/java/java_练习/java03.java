package java_练习;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/10/18 0018.
 */
public class java03 {
    public static void main(String[] args) {
        //zhu01();
        zhu02();
    }
    public static void zhu01(){
        //输入一个任意的浮点数，例如3.123456789，保留其两位小数输出，无需四舍五入
        Scanner input = new Scanner(System.in);
        double d = input.nextDouble();      // 键盘录入
        System.out.println((int) (d * 100) / 100.0 );
    }
    public static void zhu02(){
        //输入一个任意的5位整数，将它保留到百位，无需四舍五入
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();          // 键盘录入
        System.out.println(i / 100 * 100);
    }
}
