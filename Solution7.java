public class Solution7 {
    //字符串逆置，循环次数去重
    public void Reverse(char[] list, int start, int end){
        while(start < end){
            char temp = list[start];
            list[start] = list[end];
            list[end] = temp; start++;
            end--;
        }
    }public String LeftRotateString(String str,int n) {
        if(str.length() == 0 || n == 0){
            return str;
        }
        n %= str.length();
        char[] list = str.toCharArray();
        Reverse(list, 0, n-1);
        Reverse(list, n, str.length()-1);
        Reverse(list, 0, str.length()-1);
        return new String(list);
    }
}