package java_练习1;

import java.util.Scanner;
public class java_03 {
    public static void main(String[] args) {
        zhu1();
    }
    public static void zhu(){
        // 输入一个年份，判断这个年份是否是闰年 能整除400或整除4却不能整除100
        Scanner x=new Scanner(System.in);
        int xx=x.nextInt();
        if (xx%400==0 || (xx%4==0 && xx%100!=0)){
            System.out.println(xx+"为闰年");
        }
        else
            System.out.println(xx+"不为闰年");
    }
    public static void zhu1(){
        //输入一个数进行判断，分为优秀跟及格和不及格
        Scanner x=new Scanner(System.in);
        int xx=x.nextInt();
        if (xx>0 && xx<100){
            if (xx>80){
                System.out.println(xx+"为优秀");
            }
            else if (xx<=80 && xx>60){
                System.out.println(xx+"为及格");
            }
            else
                System.out.println("不及格");
        }
        else
            System.out.println("该数太大");
    }
}
