package java_数组;

/**
 * Created by Administrator on 2017/11/18 0018.
 */
public class java_Look_up {
    public static void main(String[] args) {
            int arr[]={12,23,25,28,29,30,35};
            Look_up(0,arr.length-1,30,arr);

            Look_up1();
    }
    static void Look_up(int le,int ri,int ba,int arr[]){    // 数组的查找 二分查找
            // 首先找到中间的数
        int Zj=(le+ri)/2;
        int Va=arr[Zj];
        if (ri>=le){
            if (Va>ba){
                Look_up(le,Zj-1,ba,arr);
            }
            else if (Va<ba){
                Look_up(Zj+1,ri,ba,arr);
            }
            else if (Va==ba){
                System.out.println("你要找的数的下标为："+Zj);
            }
        }
    }
    static void Look_up1(){                                 // 二维数组的定义与使用
            int x[][]=new int[3][4];
            x[0][0]=9;
            x[0][2]=8;
            x[1][1]=5;
            x[2][3]=6;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }
    }
}
