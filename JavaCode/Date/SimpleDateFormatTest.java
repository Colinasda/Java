package Date;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
    @Test
    public void test() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();

        Date date = new Date();
        System.out.println(date);

        //格式化：Date转换为String
        String str = simpleDateFormat.format(date);
        System.out.println(str);

        //解析，格式化的逆过程
        Date date1 = simpleDateFormat.parse("20-8-27 上午10:06");
        System.out.println(date1);

        //带参数的构造器
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format1 = sdf.format(date);
        System.out.println(format1);
    }

}
