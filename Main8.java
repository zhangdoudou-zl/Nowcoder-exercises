import java.util.*;

public class Main8 {
    public static void main(String[] args) {
        //查找兄弟单词
        Scanner sc =new Scanner(System.in);
        while (sc.hasNext()){

            List list=new ArrayList();
            int num=sc.nextInt();
            String[] words=new String[num];
            for (int i=0;i<num;i++){
                words[i]=sc.next();
            }

            String brother=sc.next();
            char[] chars = brother.toCharArray();

            int n=sc.nextInt(); //找第几个兄弟单词

            Arrays.sort(chars);

            int count=0;
            for (int i =0;i<words.length;i++){
                int c=check(words[i],brother);
                count+=c;
                if (c==1){
                    list.add(words[i]);
                }
            }
            System.out.println(count);
            Collections.sort(list);

            if(count>=n)
                System.out.println(list.get(n-1));
        }
    }

    private static int check(String word, String brother) {
        if (word.equals(brother)||word.length()!=brother.length()){
            return 0;
        }
        char[] chars = word.toCharArray();
        char[] chars1 = brother.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars1);
        return Arrays.equals(chars, chars1)?1:0;
    }
}
