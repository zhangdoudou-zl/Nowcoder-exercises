import java.util.*;

public class Replacement {

    public static String replaceSpace(String iniString, int length) {
        // write code here
         StringBuilder sb=new StringBuilder();
        for (int i=0;i<iniString.length();i++){
            char c = iniString.charAt(i);

            if (c==' '){
                sb.append("%20");
            }else {
                sb.append(c);
            }
        }
        return sb.toString();
    }




}