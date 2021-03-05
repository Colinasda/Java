package IO;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String[] args) {
        try {
            InetAddress inet1 = InetAddress.getByName("www.baidu.com");
            System.out.println(inet1);

            //获取本地IP
            InetAddress inet2 = InetAddress.getLocalHost();
            System.out.println(inet2);

            //两个常用方法
            System.out.println(inet2.getHostName());
            System.out.println(inet2.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }


    }
}
