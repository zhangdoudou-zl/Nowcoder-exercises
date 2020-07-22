
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main5{
    //将一串电话号码列表，转换成数字形式的号码，并去除重复的部分
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String symbol="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String number="222333444555666777788899991234567890";
        while (scanner.hasNext()){
            List list=new LinkedList();
            int n=scanner.nextInt();

            for (int i=0;i<n;i++) {
                String str = scanner.next();
                String result = "";
                str = str.replace("-", "");

                for (int j = 0; j < 7; j++) {
                    result += number.charAt(symbol.indexOf(str.charAt(j)));
                }
                result = result.substring(0, 3) + "-" + result.substring(3, 7);

                if (!list.contains(result)) {
                    list.add(result);
                }
            }
            Collections.sort(list);
            for (int i=0;i<list.size();i++){
                System.out.println(list.get(i));
            }
            System.out.println();
        }
    }
}