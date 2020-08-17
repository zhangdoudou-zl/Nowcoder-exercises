

 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

public class Solution11 {
  
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return null;
        }
        ListNode prev=head;
        ListNode cur=prev.next;
        while(cur!=null){
            if(cur.val==val){
                prev.next=cur.next;
                cur=cur.next;
            }else{
                prev=cur;
                cur=cur.next;
            }
        }

        if(head.val==val){
            head=head.next;
        }

        return head;
    }
}