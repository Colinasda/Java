package String;

import org.junit.Test;

public class StringBufferBuilderTest {
    @Test
    public void test2(){
        StringBuffer str1 = new StringBuffer("abc");
        str1.append(1);
        str1.append('1');
        System.out.println(str1);

        //System.out.println(str1.delete(2, 4));
        //System.out.println(str1.replace(2, 4, "hello"));
        //System.out.println(str1.insert(2, false));

        //反转
        str1.reverse();
        System.out.println(str1);
    }


    @Test
    public void test1(){
        StringBuffer sb1 = new StringBuffer("abc");
        sb1.setCharAt(0,'m');
        System.out.println(sb1);//mbc

        StringBuffer sb2 = new StringBuffer();
        System.out.println(sb2.length());//0
    }
}
