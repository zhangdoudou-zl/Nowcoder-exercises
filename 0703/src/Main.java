/**
 * @program: 0703
 * @description:获取候选人的票数。如果传入为空指针，返回无效的票数，同时说明本次投票活动结束，释放资源输入： char* pCandidateName 候选人姓名。当输入一个空指针时，返回无效的票数
 * 输出：无返回：该候选人获取的票数
 * @author: Zhang lin
 * @create: 2020-07-03 23:02
 **/
import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;
public class Main{
    public static void main(String args[]){
//控制台输入数据
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
//候选人人数
            int n = in.nextInt();
            String[] s = new String[n];
//记录候选人
            HashMap<String,Integer> hs = new HashMap<String,Integer>();
            for(int i=0;i<n;i++){
                String temp = in.next();
                hs.put(temp,0);
                s[i] = temp;
            }
//投票人数
            int m = in.nextInt();
            Set<String> keys = hs.keySet();
            int cnt = 0;
            for(int i=0;i<m;i++){
//投票
                String tick = in.next();
                if(keys.contains(tick)){
                    hs.put(tick, hs.get(tick)+1);
                }else{
                    cnt++;
                }
            }
//输出结果
            for(String k:s){
                System.out.println(k+" : "+hs.get(k));
            }
            System.out.println("Invalid : "+cnt);
        }
        in.close();
    }
}
