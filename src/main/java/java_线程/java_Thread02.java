package java_线程;
// 做个卖票程序 一个100张票 3个线程卖出
public class java_Thread02 {
    public static void main(String[] args) {
        Thread02 m1= new Thread02();

        // 创建线程
        Thread x1=new Thread(m1);
        Thread x2=new Thread(m1);
        Thread x3=new Thread(m1);

        x1.start();
        x2.start();
        x3.start();
    }
}
class Thread02 implements Runnable{
    int sun=1;
    public void run() {
        while (true) {

            synchronized (this) {       // 加这行代码表示不会出现多线程并发 意思是不会一张票有几个线程卖

                try {
                    // 一秒出一张票
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (sun <= 100) {
                    System.out.println(Thread.currentThread().getName() + "  卖出了" + sun + "张票");
                    sun++;
                } else {
                    break;
                }
            }
        }
    }
}