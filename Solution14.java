import java.util.ArrayList;
import java.util.Stack;

class ListNode{
    public int val;
    public ListNode next=null;

    public ListNode(int val){
        this.val=val;
    }

}
public class Solution14 {
//输入一个链表，按链表从尾到头的顺序返回一个ArrayList

    //方法一：stack
  public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
    Stack<Integer> st = new Stack<>();
    while(listNode != null){
        st.push(listNode.val);
        listNode = listNode.next;
    }
    ArrayList<Integer> list = new ArrayList<>();
    while(!st.empty()){
        list.add(st.pop());
    }return list;

  }


  //方法二：逆置数组
  public ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
      ArrayList<Integer> list = new ArrayList<>();
      while(listNode != null){
          list.add(listNode.val);
          listNode = listNode.next;
      }
      int i = 0;
      int j = list.size() - 1;
      while(i < j){
          Integer temp = list.get(i);
          list.set(i, list.get(j));
          list.set(j, temp);
          i++;
          j--;
      }
      return list;
  }


  //方法三：递归


    public static void  printListFromTailToHeadCore(ArrayList<Integer> list, ListNode listNode) {
      if(listNode == null){
          return;
      }
      printListFromTailToHeadCore(list, listNode.next);
      list.add(listNode.val);
    }

    public static ArrayList<Integer> printListFromTailToHead3(ListNode listNode) {
      ArrayList<Integer> list = new ArrayList<>();
      printListFromTailToHeadCore(list, listNode);
      return list;
    }


}
