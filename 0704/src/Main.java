import java.util.Scanner;

/**
 * @program: 0704
 * @description:守型数
 * @author: Zhang lin
 * @create: 2020-07-04 15:49
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int pow=n*n;
            func(n,pow);
        }
    }

    private static void func(int n, int pow) {
        String n1=String.valueOf(n);
        String pow2=String.valueOf(pow);
        String s=pow2.substring(pow2.length()-n1.length(),pow2.length());
        if (s.equals(n1)){
            System.out.println("Yes!");
        }else {
            System.out.println("No!");
        }
    }
}
