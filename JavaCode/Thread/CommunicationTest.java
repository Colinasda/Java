package Thread;

//线程的通信

//两个线程，交替打印1-100之间的数

class Number implements Runnable{
    private int number = 1;

    @Override
    public void run() {
        while(true){
            synchronized(this){
                if(number <= 100){
                    //唤醒被阻塞的线程
                    notify();

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number ++;

                    //阻塞当前的线程，并释放锁
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }else {
                    break;
                }
            }

        }
    }
}

public class CommunicationTest {
    public static void main(String[] args) {
        Number num = new Number();

        Thread t1 = new Thread(num);
        Thread t2 = new Thread(num);

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();
    }
}
