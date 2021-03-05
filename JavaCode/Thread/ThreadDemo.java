package Thread;

//创建两个分线程，其中一个线程遍历1-100的偶数，另一个线程遍历1-100的基数

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread1 m1 = new MyThread1();
        MyThread2 m2 = new MyThread2();
        m1.start();
        m2.start();

        //  也可以使用匿名对象的方式执行
    }
}

class MyThread1 extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            if( i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

class MyThread2 extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            if( i % 2 !=0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}