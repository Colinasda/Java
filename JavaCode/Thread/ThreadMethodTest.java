package Thread;

/*
测试Thread中常见的方法
1.start():启动当前线程，调用当前线程的run（）
2.run():通常需要重写该方法以实现某功能
3.CurrentThread():静态方法，返回当前代码执行的线程
4.getName():获取当前线程的名字
5.setName():设置当前线程的名字
6.yield():释放当前cpu的执行权
7.join():在线程a中调用线程b的join（）方法，此时线程a就进入阻塞状态，直到线程b执行完毕，线程a才结束阻塞状态
8.stop():已过时，强制结束当前线程
9.sleep(long millis):静态方法，让当前线程处于"睡眠"状态，在指定的millitime时间内，线程处于阻塞状态
10.isAlive():判断当前线程是否存活


线程的优先级：
MAX_PRIORITY:10
MIN_PRIORITY:1
NORM_PRIORITY:5

getPriority():获取
setPriority(int p):设置

说明：高优先级并不意味着一定先执行，只是从概率上讲，更可能优先被执行

 */

class HelloThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0) {

                try {
                    sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
//            if(i % 20 == 0){
//                yield();
//            }
        }
    }
}

public class ThreadMethodTest {
    public static void main(String[] args) {
        HelloThread h1 = new HelloThread();

        h1.setName("线程一");
        h1.start();

        //给主线程命名
        Thread.currentThread().setName("主线程");
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }

            if(i == 20){
                try {
                    h1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println(h1.isAlive());
    }
}
