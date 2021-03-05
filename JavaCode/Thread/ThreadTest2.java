package Thread;

/*
创建多线程的方式之二：实现Runnable接口
1创建一个实现Runnable接口的类
2实现类去实现Runnable中的抽象方法：Run（）
3创建实现类的对象
4将此对象作为参数传递到Thread中的构造器，创建Thread对象
5通过Thread类的对象调用start（）方法
 */

class MThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 ==0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

public class ThreadTest2 {
    public static void main(String[] args) {
        MThread mThread = new MThread();
        Thread t1 = new Thread(mThread);
        t1.start();

        Thread t2 = new Thread(mThread);
        t2.start();
    }
}
