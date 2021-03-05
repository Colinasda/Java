package Thread;

//创建线程的方式四：线程池

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class NumberThread implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}

public class ThreadPool {
    public static void main(String[] args) {
        //1提供指定数量的线程池
        ExecutorService service = Executors.newFixedThreadPool(10);
        //2执行指定的线程操作
        service.execute(new NumberThread());  // 适合Runnable接口
        //service.submit();   //适合Callable接口
        //3需要手动关闭连接池
        service.shutdown();
    }
}
