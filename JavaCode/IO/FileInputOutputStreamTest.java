package IO;

import org.junit.Test;

import java.io.*;

public class FileInputOutputStreamTest {
    @Test
    public void testFileInputStream() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File srcFile = new File("香港图书馆.jpeg");
            File destFile = new File("香港图书馆test.jpeg");

            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);

            byte[] bytes = new byte[5];
            int len;
            while ((len = fis.read(bytes)) != -1){
                fos.write(bytes,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }



    }

    //指定路径下文件的赋值
    public void copyFile(String srcPath,String destPath){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File srcFile = new File(srcPath);
            File destFile = new File(destPath);

            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);

            byte[] bytes = new byte[1024];
            int len;
            while ((len = fis.read(bytes)) != -1){
                fos.write(bytes,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    @Test
    public void test(){
        long start = System.currentTimeMillis();

        String srcPath = "香港图书馆.jpeg";
        String destPath = "香港图书馆test.jpeg";
        copyFile(srcPath,destPath);

        long end = System.currentTimeMillis();

        System.out.println("复制所用的时间为：" + (end - start));//104
    }
}
