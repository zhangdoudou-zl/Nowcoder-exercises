import java.util.Scanner;

/**
 * @program: 0706
 * @description:奇校验
 * @author: Zhang lin
 * @create: 2020-07-06 09:44
 **/
public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String s=sc.nextLine();
            char[] ch=s.toCharArray();
            for (int i=0;i<ch.length;i++){
                JiJiaoYan(ch[i]);
            }
        }


    }

    private static void JiJiaoYan(char ch) {
        int[] result=new int[8];
        int n=1;
        int count=0;
        for (int i=7;i>=0;i--){
            result[i]=(n&ch)==0?0:1;
            if (result[i]==1){
               count++;
            }
            n=n<<1;
        }
        if (count%2==0){
            result[0]=1;
        }
        for (int i=0;i<result.length;i++){
            System.out.print(result[i]);
        }
        System.out.println();

    }
}
