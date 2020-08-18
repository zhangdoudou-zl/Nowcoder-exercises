public class Solution12 {
    //判断链表的回文结构

    public boolean chkPalindrome(Node head) {
        if (head == null) {
            return false;
        }
        //只有头，必然是回文结构
        if (head.next == null) {
            return true;
        }
        Node fast = head;
        Node slow = head;
        //找到中间结点
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        Node cur = slow.next;
        //反转后半部分链表
        while (cur != null) {
            Node curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        //一个从头走一个从尾巴走，判断是否相等
        while (slow != head) {
            if (slow.data != head.data) {
                return false;
            }
            //判断链表节点数为偶数的情况
            if (head.next == slow) {
                return true;
            }
            slow = slow.next;
            head = head.next;
        }
        return true;
    }
}
