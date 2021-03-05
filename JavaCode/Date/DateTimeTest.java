package Date;

import org.junit.Test;

import java.util.Date;

public class DateTimeTest {
    @Test
    public void test2(){
        //构造器一：创建当前时间的Date对象
        Date date1 = new Date();
        System.out.println(date1.toString());//Tue Aug 25 09:51:25 CST 2020
        System.out.println(date1.getTime());//1598320388310

        //构造器二：创建指定毫秒数的Date对象
        Date date2 = new Date(1598320388310L);
        System.out.println(date2.toString());

        java.sql.Date date3 = new java.sql.Date(1598320388310L);
        System.out.println(date3);//2020-08-25
    }


    @Test
    public void test1(){
        long time = System.currentTimeMillis();
        System.out.println(time);
    }
}
