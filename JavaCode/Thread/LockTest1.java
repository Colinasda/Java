package Thread;

//解决线程安全问题方式三：Lock

import java.util.concurrent.locks.ReentrantLock;

class WindowLock implements Runnable{
    private int ticket = 100;

    //1.实例化ReentrantLock
    private ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {


        while(true){
            try{
                //2.调用锁定方法lock（）
                lock.lock();

                if(ticket > 0){

                    try {
                        Thread.sleep(100);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + ":卖票，票号为：" + ticket);
                    ticket--;
                }else {
                    break;
                }
            }finally {
                //3.调用解锁方法unlock（）
                lock.unlock();
            }

        }
    }
}

public class LockTest1 {
    public static void main(String[] args) {
        WindowLock wl = new WindowLock();

        Thread t1 =new Thread(wl);
        Thread t2 =new Thread(wl);
        Thread t3 =new Thread(wl);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
