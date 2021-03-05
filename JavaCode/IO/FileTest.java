package IO;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {
    @Test
    public void test(){
        File file1 = new File("Hello.txt");

        System.out.println(file1.getAbsoluteFile());
        System.out.println(file1.getPath());
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        System.out.println(file1.length());
        System.out.println(new Date(file1.lastModified()));

        System.out.println();

        System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());
        System.out.println(file1.exists());
        System.out.println(file1.canRead());
        System.out.println(file1.canWrite());
        System.out.println(file1.isHidden());
    }

    @Test
    public void test1() throws IOException {
        File file2 = new File("hi.txt");
        if(!(file2.exists())){
            file2.createNewFile();
            System.out.println("Create Successful");
        }else {
            file2.delete();
            System.out.println("Delete Successful");
        }
    }
}
