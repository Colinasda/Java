package Thread;

//多线程的创建方式一：继承Thread

/*

1。创建一个继承于Thread的子类
2。重写run（）方法
3。创建一个子类对象
4。通过此对象调用start（）方法

 */

class MyThread extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0)
            System.out.println(i);
        }
    }
}


public class ThreadTest {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        //调用start（）方法：1⃣ 启动当前的线程 2⃣ 调用当前线程的run（）方法
        mt.start();

        //如下操作仍是在main线程中执行的
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0)
                System.out.println(i + "******  main()    ********");
        }

    }
}
