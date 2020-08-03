import java.util.Scanner;

public class Main11 {
    //输出字符串中连续最长的数字串
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.nextLine();
            int count=0;
            int end=0;
            int max=0;
            for (int i=0;i<str.length();i++){
                char c=str.charAt(i);
                if (c>='0'&&c<='9'){
                    count++;
                    if (count>max){
                        max=count;
                        end=i;
                    }
                }else {
                    count=0;
                }

            } System.out.println(str.substring(end-max+1,end+1));
        }
    }
}

