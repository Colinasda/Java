package Thread;

//同步方法解决同步问题

class Window4 implements Runnable{
    private int ticket = 100;

    @Override
    public void run() {
        while(true){
            show();
        }
    }

    private synchronized void show(){
        if(ticket > 0){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "：卖票，票号为：" + ticket);
            ticket--;
        }


    }
}

public class WindowTest4 {
    public static void main(String[] args) {
        Window4 w4 = new Window4();

        Thread t1 = new Thread(w4);
        Thread t2 = new Thread(w4);
        Thread t3 = new Thread(w4);

        t1.start();
        t2.start();
        t3.start();


    }
}
