package java_线程;
// 任务要求每1秒打印一个世界你好 当打印10次后退出
public class java_Thread01 {
    public static void main(String[] args) {
    Zhu1 zhu1=new Zhu1();
    zhu1.start();


      Zhu2 zhu2=new Zhu2();
      Thread th=new Thread(zhu2);
      th.start();
    }
}
class Zhu1 extends Thread{       // 线程要继承的类Thread         方法1
    public void run() {          // 线程要用的方法run
        int x=0;
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            x++;
            System.out.println("世界你好"+"  打印了"+x+"次001");
            if (x==10){
                break;
            }
        }
    }
}
class Zhu2 implements Runnable{    // 线程要实现的接口Runnable     方法2
    public void run() {             // 线程要用的方法run
        int y=0;
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            y++;
            System.out.println("世界你好"+"  打印了"+y+"次002");
            if (y==10){
                break;
            }
        }
    }
}
