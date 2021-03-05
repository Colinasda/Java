package String;

import org.junit.Test;

public class StringTest {
    @Test
    public void test3(){
        String s1 = "Java";
        String s2 = "hadoop";

        String s3 = "Javahadoop";
        String s4 = "Java" + "hadoop";
        String s5 = s1 + "hadoop";

        String s6 = s1 + s2;

        System.out.println(s3 == s4);//true
        System.out.println(s3 == s5);//false
        System.out.println(s3 == s6);//false

        String s7 = s4.intern();
        System.out.println(s3 == s7);//true
    }




    @Test
    public void test2(){
        String s1 = "JAVAEE";
        String s2 = "JAVAEE";

        String s3 = new String("JAVAEE");
        String s4 = new String("JAVAEE");

        System.out.println(s1 == s2);//true
        System.out.println(s1 == s3);//false
        System.out.println(s3 == s4);//false
    }



    @Test
    public void test1(){
        String s1 = "abc";
        String s2 = "abc";

        System.out.println(s1 == s2);
    }
}
