
import java.util.Scanner;

public class Main3 {
     //将字符串单词逆序输出
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.nextLine();

            String[] ch = str.split(" ");
            String[] ret=new String[ch.length];
            for (int i=ch.length-1;i>=0;i--){
                ret[i]=ch[i];
                System.out.print(ret[i]+" ");
            }

        }
    }
}
