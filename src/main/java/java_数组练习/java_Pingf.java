package java_数组练习;
import javax.sound.sampled.Mixer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java_Pingf {
    public static void main(String[] args) {
        Jq j=new Jq();
        System.out.println("去掉一个最高分"+j.zg()+"   "+(j.zgindex()+1)+"号评委");
        System.out.println("去掉一个最低分"+j.zd()+"   "+(j.zdindex()+1)+"号评委");
        System.out.println("最后得分："+j.Zhdf());
    }
}
class Jq {
    int size = 5;
    float f[] = null;

    public Jq() {
        f = new float[size];
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            for (int i = 0; i < f.length; i++) {
                System.out.println("输入第" + (i + 1) + "个评委的分数：");
                f[i] = Float.parseFloat(br.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // 统计总分
    public float Zhdf() {
        int zg = this.zgindex();
        int zd = this.zdindex();
        float Tji = 0;
        for (int i = 0; i < f.length; i++) {
            if (i != zd && i != zg) {
                Tji += f[i];
            }
        }
        return Tji / (size - 2);
    }

    // 去掉最低分
    public int zdindex() {
        float minFan = f[0];
        int minindex = 0;
        for (int i = 0; i < f.length; i++) {
            if (minFan > f[i]) {
                minFan = f[i];
                minindex = i;
            }
        }
        return minindex;
    }

    // 去掉最高分
    public int zgindex() {
        float mxFan = f[0];
        int mxndex = 0;
        for (int i = 0; i < f.length; i++) {
            if (mxFan < f[i]) {
                mxFan = f[i];
                mxndex = i;
            }
        }
        return mxndex;
    }
    public float zg(){
        float Min=f[0];
        for (int i = 1; i < f.length; i++) {
            if (f[i]>Min){
                    Min=f[i];
            }
        }
        return Min;
    }
    public float zd(){
        float Mix=f[0];
        for (int i = 1; i < f.length; i++) {
            if (f[i]<Mix){
                Mix=f[i];
            }
        }
        return Mix;
    }

}
