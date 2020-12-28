package Questions.Q200;

import common.ListNode;

public class Q143 {
    public void reorderList(ListNode head) {
        ListNode front = head;
        ListNode end = head;
        while(end.next != null) {
            end = end.next;
        }
    }
}
