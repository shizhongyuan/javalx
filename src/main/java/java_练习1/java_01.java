package java_练习1;
import java.util.Scanner;
public class java_01 {
    public static void main(String[] args) {
            zhu1();
    }
    public static void zhu(){
        //输入一个数字，判断是一个奇数还是偶数
        Scanner x=new Scanner(System.in);
        int i = x.nextInt();
        if (i%2==0){
            System.out.println(i+"为偶数");
        }
        else
            System.out.println(i+"为奇数");
    }
    public static void zhu1(){
        //将分页显示的功能增加判断，如果用户输入的小于1的页码，
        // 自动赋成1，如果超出了总页码，自动赋成总页码
        Scanner x=new Scanner(System.in);
        int i = x.nextInt();
        if (i<1){
            i=1;
            System.out.println("为负数所以转为1页");
        }
        else
            System.out.println(i+"为总页码");
    }
}
