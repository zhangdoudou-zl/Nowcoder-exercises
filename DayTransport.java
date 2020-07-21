import java.util.Scanner;

public class DayTransport {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while (sc.hasNext()){
            int year=sc.nextInt();
            int month=sc.nextInt();
            int day=sc.nextInt();

            int Day=iConvertDataToDay(year,month,day);
            System.out.println(Day);
        }

    }
    public static int iConvertDataToDay(int year,int month,int day){
        int Day=0;
        int[] array={31,28,31,30,31,30,31,31,30,31,30,31};
        if (year<=0||month<=0||month>=12||day>array[month-1]||day<=0){
            return -1;
        }
        if (year%4==0&&year%100!=0||year%400==0){
            array[1]=29;
        }

        for (int i=0;i<month-1;i++){
            Day+=array[i];
        }
        Day=Day+day;
        return Day;
    }
}
