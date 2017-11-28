package java_练习;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/10/18 0018.
 */
public class java04 {
    public static void main(String[] args) {
        zhu1();
    }
    public static void zhu(){
        //输入一个0～1000的整数，求各位数的和，例如345的结果是3+4+5＝12
        //注：分解数字既可以先除后模也可以先模后除
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int i1 = i / 100;
        int i2 = i / 10 % 10;
        int i3 = i % 10;
        int x=i1+i2+i3;
        System.out.println("加起来为："+x);
    }
    public static void zhu1(){
        //输入一个任意的大写字母A~Z，转换为小写字母
        char i='B';
        char c = (char) (i + 32);
        System.out.println(c);

    }
}
