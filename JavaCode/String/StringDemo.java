package String;

//将一个字符串进行反转，将字符串中指定部分进行反转，比如"abcdefg"转换为"abfedcg"

import org.junit.Test;

public class StringDemo {
    //方法一：将字符串转换为字符数组
    public String reverse1(String str,int startIndex,int endIndex){
        if(str != null){
            char[] charArray = str.toCharArray();
            for(int x = startIndex,y = endIndex;x < y;x++,y--){
                char temp = charArray[x];
                charArray[x] = charArray[y];
                charArray[y] = temp;
            }
            return new String(charArray);
        }else{
            return null;
        }

    }

    //方法二：使用字符串拼接
    public String reverse2(String str,int startIndex,int endIndex){
        String startString = str.substring(0,startIndex);
        for(int i = endIndex;i >= startIndex;i--){
            startString += str.charAt(i);
        }
        startString += str.substring(endIndex + 1);
        return startString;
    }

    //方法三：使用StringBuilder或者StringBuffer来替代String
    public String reverse3(String str,int startIndex,int endIndex){
        StringBuilder builder = new StringBuilder(str.length());

        builder.append(str.substring(0,startIndex));

        for (int i = endIndex; i >= startIndex ; i--) {
            builder.append(str.charAt(i));
        }

        builder.append(str.substring(endIndex + 1));

        return new String(builder);
    }


    @Test
    public void test(){
        String str = "abcdefg";
        System.out.println(reverse3(str, 2, 5));
    }
}
