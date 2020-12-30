package Questions.Q200;

import common.ListNode;

public class Q143 {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) {
            return;
        }
        ListNode front = head;
        ListNode nodeBeforeLast = nodeBeforeLast(front);
        ListNode last = nodeBeforeLast.next;
        
        while(front != null && front.next != null && nodeBeforeLast != null) {
            nodeBeforeLast.next = null;
            last.next = front.next;
            front.next = last;
            front = last.next; // 关键，怎么向下移动front，不能用front.next.next，不然head也会一起变化
            nodeBeforeLast = nodeBeforeLast(front);
            if( nodeBeforeLast != null) {
                last = nodeBeforeLast.next;
            }
        }
    }
    
    
    public ListNode nodeBeforeLast(ListNode head) {
        ListNode end = head;
        if(head == null || head.next == null || head.next.next == null) {
            return null;
        }
        while(end.next != null && end.next.next != null) {
            end = end.next;
        }
        return end;
    }
}
