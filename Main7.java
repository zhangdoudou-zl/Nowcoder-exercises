import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main7 {
    //nowcoder有两盒（A、B）乒乓球，有红双喜的、有亚力亚的……
    // 现在他需要判别A盒是否包含了B盒中所有的种类，并且每种球的数量不少于B盒中的数量
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        while (sc.hasNext()){
            String str1=sc.next();
            String str2=sc.next();


            Map<String,Integer> mapA=new HashMap<>();
            Map<String,Integer> mapB=new HashMap<>();

            for (int i=0;i<str1.length();i++){
                String s1 = str1.charAt(i)+"";
                if (!mapA.containsKey(s1)){
                    mapA.put(s1,1);
                }else {
                    mapA.put(s1,mapA.get(s1)+1);
                }
            }

            for (int i=0;i<str2.length();i++){
                String s2 = str2.charAt(i)+"";
                if (!mapB.containsKey(s2)){
                    mapB.put(s2,1);
                }else {
                    mapB.put(s2,mapB.get(s2)+1);
                }
            }




            int count=0;
            for (int i=0;i<str2.length();i++){
                if (mapA.containsKey(str2.charAt(i)+"")){
                    mapA.put(str2.charAt(i)+"",mapA.get((str2.charAt(i)+""))-1);
                    if (mapA.get(str2.charAt(i)+"")<0){
                        System.out.println("No");
                        break;
                    }

                }else {
                    System.out.println("No");
                    break;
                }
                count++;
            }
            if (count==str2.length()){
                System.out.println("Yes");
            }


        }
    }
}
