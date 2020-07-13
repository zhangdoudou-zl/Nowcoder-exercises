import java.util.*;
//输入一行字符串，计算其中A-Z大写字母出现的次数
public class TestDemo {
 public static void main(String[] args) {
  Scanner scanner = new Scanner (System. in);
  while (scanner. hasNextLine()) {
   String line = scanner. nextLine();
   int [] count = new int[26]; // 因为只有26个英文字母，所以只需要26长度
   for (int i = 0; i < line.length(); i++) {
    char ch = line. charAt(i);
    if(ch>='A'&&ch<='z'){
//哈希中的直接定址法
    count[ch -'A']++;
   }
  }
  for(int i=0;i<26;i++){
   System. out. printf("%c:%d%n",('A' + i),count[i]);
  }
 }
}
}
