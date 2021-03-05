package String;

import org.junit.Test;

import java.util.Arrays;

public class StringTest1 {
    @Test
    //String和byte[]字节数组之间的转换
    //编码：字符串-->字节
    //解码：字节-->字符串
    public void test3(){
        String s1 = "abc123中国";
        byte[] bytes = s1.getBytes();
        System.out.println(Arrays.toString(bytes));

        String str = new String(bytes);
        System.out.println(str);
    }


    @Test
    //String和char[]之间的转换
    public void test2(){
        String str1 = "abc123";
        char[] charArray = str1.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }

        System.out.println("******************");

        char[] arr = new char[]{'h','e','l','l','o'};
        String str2 = new String(arr);
        System.out.println(str2);
     }


    @Test
    //String和基本数据类型，包装类的转换
    public void test1(){
        String str1 = "123";
        int num = Integer.parseInt(str1);
        num++;
        System.out.println(num);

        String str2 = String.valueOf(num);
        System.out.println(str2);
    }
}
