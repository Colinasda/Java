package String;

//获取一个字符串在另一个字符串中出现的次数
//比如获取"ab"在字符串"abkkcadkabkebfkabkskab"中出现的次数

import org.junit.Test;

public class StringDemo1 {
    public int getCount(String mainString,String subString){
        int mainLength = mainString.length();
        int subLength = subString.length();
        int count = 0;
        int index;

        if(mainLength >= subLength){
            while((index = mainString.indexOf(subString)) != -1){
                count++;
                mainString = mainString.substring(index + subLength);
            }
            return count;
        }else{
            return 0;
        }
    }

    @Test
    public void test(){
        String mString = "abkkcadkabkebfkabkskab";
        String sString = "ab";
        int count = getCount(mString,sString);
        System.out.println(count);
    }
}
