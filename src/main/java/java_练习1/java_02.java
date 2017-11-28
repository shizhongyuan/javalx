package java_练习1;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/10/18 0018.
 */
public class java_02 {
    public static void main(String[] args) {
        zhu1();
    }
    public static void zhu(){
        //3.判断一个数字是否能被5和6同时整除（打印能被5和6整除），
        // 或只能被5整除（打印能被5整除），或只能被6整除，（打印能被6整除），
        // 不能被5或6整除，（打印不能被5或6整除）
        Scanner x=new Scanner(System.in);
        int xx=x.nextInt();
        if (xx%5==0 && xx%6==0){
            System.out.println(xx+"可以被5和被6整除");
        }
        else if (xx%5==0 && xx%6!=0){
            System.out.println(xx+"可以被5整除但不能被6整除");
        }
        else if (xx%5!=0 && xx%6==0){
            System.out.println(xx+"不可以被5整除但可以被6整除");
        }
        else
            System.out.println(xx+"不可以被5整除也不可以被6整除");
    }
    public static void zhu1(){
        // 输入两个小于5000的正随机整数，求它们差的绝对值，并输出结果。
        System.out.println("输入第1个数：");
        Scanner x=new Scanner(System.in);
        int xx=x.nextInt();
        System.out.println("输入第2个数:");
        int yy=x.nextInt();
        if (xx<5000 && yy<5000){
            int i=xx-yy;
            int abs = Math.abs(i);// 取绝对值
            System.out.println("差的绝对值为："+abs);
        }
        else
            System.out.println("对不起你输入的数太大");
    }
}
