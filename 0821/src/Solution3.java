import java.util.*;
public class Solution3{
    //旧键盘上坏了几个键，于是在敲一段文字的时候，对应的字符就不会出现。现在给出应该输入的一段文字、以及实际被输入的文字，请你列出
    //肯定坏掉的那些键
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String expect=sc.nextLine();
        String actual=sc.nextLine();

        HashSet<Character> set=new HashSet<>();
        HashSet<Character> setBroken=new HashSet<>();
        for(char s:actual.toUpperCase().toCharArray()){
            set.add(s);
        }

        for (char c:expect.toUpperCase().toCharArray()){
            if(!set.contains(c)&&!setBroken.contains(c)){
                System.out.print(c);
                setBroken.add(c);
            }
        }

        System.out.println(setBroken.toArray());


    }
}