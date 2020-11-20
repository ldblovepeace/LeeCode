package Questions.Q200;

import common.ListNode;

public class Q147 {
	public ListNode insertionSortList(ListNode head) {
		ListNode index = head;
		ListNode tmp;
		
		while(index.next != null) {
			if(index.next.val >= index.val) {
				index = index.next;
			}else {
				if(head.val > index.next.val) {
					tmp = index.next;
					index.next = tmp.next;
					tmp.next = head;
					head = tmp;
					continue;
				}
				ListNode insertIndex = head;
				while(insertIndex.next!=null) {
					if(insertIndex.next.val <= index.next.val) {
						insertIndex = insertIndex.next;						
					}else {
						tmp = index.next;
						index.next = tmp.next;
						tmp.next = insertIndex.next;
						insertIndex.next = tmp;
						break;
					}
				}
			}
		}
		
		return head;
    }
}
