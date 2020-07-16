import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    //每组测试用例仅包含一组数据，每组数据第一行为一个正整数 n 表示操作的数量(1 ≤ n ≤ 50000) ，
    // 接下来有n行，每行第一个整数为操作类型 i (i ∈ {1,2})，第二个整数为一个长度 L(1 ≤ L ≤ 1,000,000,000)。
    // 如果 i=1 代表在集合内插入一个长度为 L 的木棒，如果 i=2 代表删去在集合内的一根长度为 L 的木棒。
    // 输入数据保证删除时集合中必定存在长度为 L 的木棒，且任意操作后集合都是非空的
    static List<Integer> list= new LinkedList<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

            int n=sc.nextInt();
            for (int i=0;i<n;i++){
                int select=sc.nextInt();
                int length=sc.nextInt();

                if (select==1){
                    list.add(length);
                }if(select==2&&list.size()>1){
                    list.remove(searchIndex(length));
                }
                judge();
            }
        }


    private static void judge() {
        int max_length=0;
        int sum=0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max_length) {
                max_length = list.get(i);
            }
        }

        for (int j=0;j<list.size();j++){
            sum+=list.get(j);
        }
        sum=sum-max_length;

        if (sum>max_length){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }

    private static int searchIndex(int length) {
        int i=0;
        for (i=0;i<list.size();i++){
            if (length==list.get(i)){
                break;
            }
        }
        return i;
    }
}
