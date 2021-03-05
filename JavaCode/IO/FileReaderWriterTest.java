package IO;

import org.junit.Test;

import java.io.*;

public class FileReaderWriterTest {
    //测试FileReader中的read（）方法
    @Test
    public void test() {
        File file = new File("hello.txt");

        FileReader fr = null;
        try {
            fr = new FileReader(file);

            int data;
            while ((data = fr.read()) != -1){
                System.out.print((char)data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }


    //测试FileReader中的read（cbuf[])方法
    @Test
    public void test1() {
        File file1 = new File("hello.txt");

        FileReader fr = null;
        try {
            fr = new FileReader(file1);

            char[] cbuf = new char[5];
            int len;
            while ((len = fr.read(cbuf)) != -1){
                for (int i = 0; i < len; i++) {
                    System.out.print(cbuf[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


    //测试FileWriter中的write（）方法
    @Test
    public void testFileWriter(){
        File file = new File("hello1.txt");

        FileWriter fw = null;
        try {
            fw = new FileWriter(file);

            fw.write("I have a dream !\n");
            fw.write("Hello I know");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }


    //将文件读取，并写入另一个文件
    @Test
    public void testFileReaderFileWriter() {
        File file1 = new File("hello.txt");
        File file2 = new File("test.txt");

        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader(file1);
            fw = new FileWriter(file2);

            char[] cbuf = new char[5];
            int len;
            while ((len = fr.read(cbuf)) != -1){
                fw.write(cbuf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
