import java.util.*;
public class Main2{
    //将字符串1中 包含字符串2中的任意字符 删除
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            String str1=sc.nextLine();
            List<String> list=new LinkedList<>();
            for(int i=0;i<str.length();i++){
                char c = str.charAt(i);
                if(!str1.contains(c+"")){
                    list.add(c+"");
                }
            }
            for (int i=0;i<list.size();i++){
                System.out.print(list.get(i));
            }

        }
    }
}