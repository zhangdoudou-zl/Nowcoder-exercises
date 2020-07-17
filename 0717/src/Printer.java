import java.util.*;

public class Printer {
    //二维数组打印

    //我们只需要先确定右上角的坐标startX = 0,startY = n-1.最左小角的数据坐标为(3,0)。当这个数字打
    //印完后，横坐标+1，超出了行数。那么打印结束。：横坐标+1，纵坐标+1
    public int[] arrayPrint(int[][] arr, int n) {
        // write code here
        int[] res = new int[n*n];
        int index = 0;
        int startX = 0;
        int startY = n-1;
        while(startX < n){
            int x = startX;
            int y = startY;
            while(x<n&&y<n) {
                res[index++] = arr[x++][y++];
            }
            if(startY>0)
                startY--;
            else
                startX++;//确定新的开始横坐标
        }
        return res;
    }
}