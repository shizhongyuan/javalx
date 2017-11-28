package java_练习;

/**
 * Created by Administrator on 2017/10/18 0018.
 */
public class java01 {
    public static void main(String[] args) {
        //华氏温度和摄氏温度互相转换，从华氏度变成摄氏度你只要减去32，
        // 乘以5再除以9就行了，将摄氏度转成华氏度，直接乘以9，除以5，
        // 再加上32即行。
        double f=100;       // 华氏温
        double f1=37;       // 摄氏温
        double v = (f - 32) * 5 / 9;
        System.out.println(v);
        double v1 = f1 * 9 / 5;
        System.out.println(v1);
    }
}
