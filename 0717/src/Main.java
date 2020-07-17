import java.util.Scanner;

public class Main {
    //判断字符串删掉一个字符能否变成回文结构
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.nextLine();

            //去掉两端 或者本身是回文结构
            if (isHuiWen(str.substring(0,str.length()-1))||isHuiWen(str.substring(1,str.length()))||isHuiWen(str)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }


    }
    public static boolean isHuiWen(String s){
       return new StringBuffer(s).reverse().equals(s);
    }
}
