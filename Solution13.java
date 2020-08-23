public class Solution13 {
//在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递
//增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
    public static boolean Find(int target, int[][] array) {
        if (array == null) {
            return false;
        }
        int i = 0;
        int j = array[0].length - 1;
        while (i < array.length & j >= 0) {
            if (target < array[i][j]) {//array[i][j]- 定是当前行最大的，当前列最小的
//target < array[][j]排除当前列
                j--;
            } else if (target > array[i][j]) {
//target > array[i][j] 排除当前行
                i++;
            } else {
//找到
                return true;
            }

        }return false;
    }
}
