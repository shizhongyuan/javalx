package java_数组;
public class java_array {
    public static void main(String[] args) {
        // 选择排序比冒泡排序稍微快点
        int arr[]={12,25,16,84,75,17,54};
        Traversal(arr);

        Sequencing(arr);

        Sequencing1(arr);
    }
    static  void Traversal(int x[]){        // 数组的遍历
        System.out.print("数组的遍历：");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]+" ");
    }
    }
    static void Sequencing(int y[]){        // 数组的排序 冒泡排序
        for (int i = 0; i < y.length-1; i++) {
            for (int j = i+1; j <y.length ; j++) {
                if (y[i]>y[j]){
                    int x=y[i];
                    y[i]=y[j];
                    y[j]=x;
                }
            }
        }
        System.out.println();
        System.out.print("冒泡排序:");
        for (int i = 0; i < y.length; i++) {
            System.out.print(y[i]+" ");
        }
    }
    static void Sequencing1(int x[]){       // 数组的排序 选择排序
        for (int i = 0; i <x.length-1; i++) {
            int m=x[i];
            int mi=i;
            for (int j = i+1; j <x.length ; j++) {
                if (m>x[j]){
                    m=x[j];
                    mi=j;
                }
            }
            int min=x[i];
            x[i]=x[mi];
            x[mi]=min;
        }
        System.out.println();
        System.out.print("选择排序:");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]+" ");
        }
    }
}
