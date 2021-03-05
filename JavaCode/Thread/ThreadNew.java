package Thread;

//JDK5.0新增的 实现Callable接口

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

//1实现Callable接口的实现类
class NumThread implements Callable{
    int sum = 0;
    //2实现call（），此方法有返回值
    @Override
    public Object call() throws Exception {
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}


public class ThreadNew {
    public static void main(String[] args) {
        //3创建Callable接口实现类的对象
        NumThread numThread = new NumThread();
        //4将此对象作为参数传递到FutureTask构造器中，创建FutureTask对象
        FutureTask futureTask = new FutureTask(numThread);
        //将FutureTask对象传递到Thread类的构造器中，创建Thread对象，并执行start（）方法
        new Thread(futureTask).start();

        try {
            //get()为FutureTask构造器参数Callable实现类重写的call（）的返回值
            Object sum = futureTask.get();
            System.out.println(sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
