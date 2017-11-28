package java_io;

/**
 * Created by Administrator on 2017/10/17 0017.
 */
public class java_2维数组 {
    public static void main(String[] args) {
        int [][] arr = {{8,6,4},{4,1,2,3},{7,7,7,7}};
        int x=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                x=x+arr[i][j];
                System.out.print(arr[i][j]+" ");    // 打印2维数组的数
            }
        }
        System.out.println("x="+x);                 // 将2维数组的数加起来
    }
}
