import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s=sc.nextLine();
            String[] ch = s.split(" ");
            String[] tmp=new String[ch.length];
            for (int i=ch.length-1;i>=0;i--){
                System.out.print(ch[i]+" ");
            }
           // System.out.println(Arrays.toString(tmp));
        }
    }
}