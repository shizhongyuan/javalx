package java_练习1;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/10/18 0018.
 */
public class java_04 {
    public static void main(String[] args) {
            zhu();
    }
    public static void zhu(){
        // 从命令行传入3个整数，求3个整数的和、积、最大值、平均值
        Scanner x = new Scanner(System.in);
        System.out.println("输入第1个数：");
        int x1=x.nextInt();
        System.out.println("输入第2个数：");
        int x2=x.nextInt();
        System.out.println("输入第3个数：");
        int x3=x.nextInt();
        int y=x1+x2+x3;
        int y1=x1*x2*x3;
        int y3=(x1+x2+x3)/3;
        System.out.println("3个整数的和为："+y);
        System.out.println("3个整数的积为："+y1);
        if (x1>x2 && x1>x3){
            System.out.println("3个整数的最大值为："+x1);
        }
        else if (x2>x1 && x2>x3){
            System.out.println("3个整数的最大值为："+x2);
        }
        else
            System.out.println("3个整数的最大值为："+x3);
        System.out.println("3个整数的平均值为："+y3);
    }
}
