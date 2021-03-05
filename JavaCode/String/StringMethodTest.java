package String;

import org.junit.Test;

public class StringMethodTest {
    @Test
    public void test4(){
        String str1 = "helloworld";
        System.out.println(str1.replace('h', 'H'));
    }


    @Test
    public void test3(){
        String str1 = "helloworld";
        System.out.println(str1.endsWith("ld"));
        System.out.println(str1.startsWith("hh"));
        //记录指定字符串的内容以及开始的位置
        System.out.println(str1.startsWith("ll", 2));

        System.out.println(str1.contains("wo"));
        //返回字符串的角标，如果没有则返回-1
        System.out.println(str1.indexOf("lo"));
        System.out.println(str1.lastIndexOf("or"));
    }



    @Test
    public void test2(){
        String s1 = "HelloWorld";
        String s2 = "helloworld";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        String s3 = "abc";
        String s4 = s3.concat("def");
        System.out.println(s4);

        String s5 = "abc";
        String s6 = "abe";
        //逐个比较两个字符串，返回值数据类型为int
        System.out.println(s5.compareTo(s6));//用于通讯录排序

        String s7 = "helloworld";
        System.out.println(s7.substring(3));
        System.out.println(s7.substring(2, 4));
    }


    @Test
    public void test1(){
        String s1 = "HelloWorld";
        System.out.println(s1.length());
        System.out.println(s1.charAt(0));
        System.out.println(s1.isEmpty());

        String s2 = s1.toLowerCase();
        System.out.println(s2);

        String s3 = "     hello  w  orld   ";
        //去除首尾的空格
        String s4 = s3.trim();
        System.out.println(s4);

    }

}
