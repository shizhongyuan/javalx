package java_练习2;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/11/15 0015.
 */
public class java04 implements inputting{
    public static void main(String[] args) {
        new java04();
    }
    java04(){
        System.out.println("输入第1个数：");
        double x=it.nextDouble();
        System.out.println("输入第2个数：");
        double x1=it.nextDouble();
        if (x>x1){
            System.out.println("第1个数大");
        }
        else if (x==x1){
            System.out.println("2个数相等");
        }
        else
            System.out.println("第2个数大");
    }
}
interface inputting  {      // 输入
    Scanner it=new Scanner(System.in);
    //double x=it.nextDouble();
}
