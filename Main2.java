import java.util.Scanner;

/**
 * @program: 0706
 * @description: 错排问题例题
 * @author: Zhang lin
 * @create: 2020-07-06 13:17
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        float sum1 = factorial(n);  //抽奖可能出现的情况作为分母：F
        float sum2 = count(n);      //每个人不可能抽中的情况作为分子：C
        float result1=(sum2/sum1)*100;
        System.out.println(String.format("%.2f", result1) + "%");

    }

    private static float factorial(int n) {
        if (n==0||n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static float count(int n) {
        if(n==1){
            return 0;
        }else if(n==2){
            return 1;
        }else{
            return (n-1)*(count(n-1)+count(n-2));
        }
    }
}
