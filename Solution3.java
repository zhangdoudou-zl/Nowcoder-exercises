import java.util.ArrayList;
public class Solution3
{
    /**
     * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
     * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
     * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
     * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
     */
    public int minNumberInRotateArray(int [] array) {
        int left=0;
        int right=array.length-1;
        while(left<right){
            if(array[left]<array[right]){
                return array[left];
            }
            int mid=left+((right-left)>>1);
            if(array[mid]>array[left]){
                left=mid+1;
            }else if(array[mid]<array[left]){
                right=mid;
            }else{
                left++;

            }


        }
        return array[left];
    }
}