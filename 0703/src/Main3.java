import java.util.Scanner;

public class Main3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String ip=sc.nextLine();
            String ip10=sc.nextLine();
            System.out.println(convertIp10(ip)); //将ip地址转化成10进制
            System.out.println(convertIp(ip10)); //将10进制地址转换成2进制
        }
    }

    private static Long convertIp10(String ip) {
        String ips[]=ip.split("\\.");
        StringBuffer sb=new StringBuffer();
        for (int i=0;i<ips.length;i++){
            sb.append(binaryStirng(ips[i]));
        }
        Long num= Long.parseLong(sb.toString(),2);
        return num;
    }

    private static String binaryStirng(String ip) {
        int k=1<<7;
        int num=Integer.parseInt(ip);
        StringBuffer sb=new StringBuffer();
        for (int i=0;i<8;i++){
            int flg=(num&k)==0?0:1;
            sb.append(flg);
            num=num<<1;
        }
        return sb.toString();
    }

    private static String convertIp(String ip){
        //String num=binaryStirng(ip);
        String num = Long.toBinaryString(Long.parseLong(ip));
        String a="";
        for (int i=0;i<32-num.length();i++){
            a+="0";
        }
        num=a+num;
        StringBuffer sb=new StringBuffer();
        int c1=Integer.parseInt(num.substring(0,8),2);
        int c2=Integer.parseInt(num.substring(8,16),2);
        int c3=Integer.parseInt(num.substring(16,24),2);
        int c4=Integer.parseInt(num.substring(24,32),2);

        sb.append(c1+".");
        sb.append(c2+".");
        sb.append(c3+".");
        sb.append(c4);
        return sb.toString();
    }

}