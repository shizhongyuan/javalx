package java_io;

/**
 * Created by Administrator on 2017/10/17 0017.
 */
public class java_数组 {
    public static void main(String[] args) {
        //java_shuzhu();              // 数组的不遍历1
      //  java_shuzhu1();              // 数组的不遍历2
        int [] arr = {12,54,21,32,41,25};
//        java_shuzhu2(arr);
//        for (int x:arr){
//            System.out.print(x+" ");    // 数组的排序
//        }
        int i = java_shuzhu3(arr, 21);  // 数组的查找
        System.out.println(i);
    }
    public static void java_shuzhu1(){
        int [] arr = {12,54,21,32,41,25};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void java_shuzhu(){
        int [] arr = {12,54,21,32,41,25};
        for (int x:arr){
            System.out.print(x+" ");
        }
    }
    public static void java_shuzhu2(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]>arr[j]){
                    int x=arr[i];
                    arr[i]=arr[j];
                    arr[j]=x;
                }
            }
        }
    }
    public static int java_shuzhu3(int[] arr,int x){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x){
                return i;
            }
        }
        return -1;
    }
}

