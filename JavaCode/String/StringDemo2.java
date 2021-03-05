package String;

//获取两个字符串中最长的相同子串
//比如：str1 = "abcwerthelloyuiodef",str2 = "cvhellobnm"

import org.junit.Test;

public class StringDemo2 {
    public String getMaxSameString(String str1,String str2){
        String maxStr = (str1.length() >= str2.length())? str1 : str2;
        String minStr = (str1.length() < str2.length())? str1 : str2;
        int length = minStr.length();

        //外层循环比较长度递减
        for(int i = 0;i < length;i++){
            //内层循环比较相同长度的不同子串
            for(int x = 0,y = length - i;y <= length;x++,y++){
                if(maxStr.contains(minStr.substring(x,y))){
                    return minStr.substring(x,y);
                }
            }
        }
        return null;
    }

    @Test
    public void test(){
        String str1 = "abcwerthelloyuiodef";
        String str2 = "cvhellobnm";
        String sameString = getMaxSameString(str1,str2);
        System.out.println(sameString);
    }

}
