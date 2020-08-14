import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Collections;
public class Solution9 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
    if(input == null || k <= 0 || k > input.length){
        return list;
    }

//按照数值从大到小
    PriorityQueue<Integer> queue = new PriorityQueue<Integer>(k, Collections.reverseOrder());
   for(int i = 0; i < input.length ; i++){
     if(i < k) {
        queue.offer(input[i]);//前提前插入k个数据，queue会自动排序

     } else{
    //否则，就要展开淘汰的过程了，每次都淘汰最大的，剩下的最终就是最小的k个
        if(input[i] < queue.peek()){
            //input[i]比最大的小，跟新之
        queue.poll();
        queue.offer(input[i]);
        }
     }
    }


   //返回对应的结果
         for(int i = 0 ; i < k; i++){
           list.add(queue.poll());
         }
    return list;

}
        }