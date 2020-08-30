public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Solution16 {
    public ListNode Merge(ListNode list1,ListNode list2) {
        //不考虑头结点(其实，考虑头结点简单，我们按照难的来)
        // 合并前，先判定
        if(null == list1){
            return list2;
        }if(null == list2){
            return list1;
        }//合并中,无非是比较各自首节点谁小，就把该节点从原链表中删除，在尾插到新节点处，比较中，两个链表任何一 个都不能为空
         ListNode new_head = null;
         ListNode new_tail = null;

        while(list1 != null && list2 != null){
            ListNode p = list1.val < list2.val ? list1 : list2;
        } if(p == list1){
            list1 = list1.next;
        }else{list2 = list2.next;
        }if(null == new_head){
            new_head = p; new_tail = p;
        }else{new_tail.next = p; new_tail = p; }
        }

    //合并后，可能会有：1. pHead1为空 2. pHead2为空 3. 都为空(合并完成)
    if(null == list1){
        new_tail.next = list2;
    }else{
        new_tail.next = list1;
    }
    return new_head;
    }
}

