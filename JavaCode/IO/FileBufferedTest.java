package IO;

import org.junit.Test;

import java.io.*;

public class FileBufferedTest {
    @Test
    public void testBuffered(){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            File file1 = new File("香港图书馆.jpeg");
            File file2 = new File("香港图书馆buffered.jpeg");

            fis = new FileInputStream(file1);
            fos = new FileOutputStream(file2);

            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            byte[] buffer = new byte[10];
            int len;
            while ((len = bis.read(buffer)) != -1){
                bos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(bis != null){
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(bos != null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


//        fis.close();
//        fos.close();
        }

    }

    public void copyFile1(String srcPath,String destPath){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            File file1 = new File(srcPath);
            File file2 = new File(destPath);

            fis = new FileInputStream(file1);
            fos = new FileOutputStream(file2);

            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1){
                bos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(bis != null){
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(bos != null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


//        fis.close();
//        fos.close();
        }
    }

    @Test
    public void test1(){
        long start = System.currentTimeMillis();

        String srcPath = "香港图书馆.jpeg";
        String destPath = "香港图书馆testBuffered.jpeg";
        copyFile1(srcPath,destPath);

        long end = System.currentTimeMillis();

        System.out.println("复制所用的时间为：" + (end - start));//28
    }
}
