import com.sun.prism.shader.DrawSemiRoundRect_ImagePattern_AlphaTest_Loader;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Arrays;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.nextLine();
            String[] s = str.split("_");
            String result=s[0];
            for (int i=1;i<s.length;i++){
               result+= (char)(s[i].charAt(0)-32)+s[i].substring(1,s[i].length());
            }
            System.out.println(result);

        }
    }
}
