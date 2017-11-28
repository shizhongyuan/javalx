package java_练习2;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/11/15 0015.
 */
public class java05 {
    public static void main(String[] args) {
        System.out.println("要打印的行数：");
        Scanner x=new Scanner(System.in);
        int xx=x.nextInt();
        for (int i = 1; i <= xx; i++) {
            for (int c = i; c <= xx-1; c++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i-1)*2+1; j++) {
                if (i==1 || i==xx) {
                    System.out.print("*");
                }
                else {
                    if (j==1 || j==(i-1)*2+1){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
