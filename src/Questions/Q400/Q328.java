package Questions.Q400;

import common.ListNode;

public class Q328 {
//	链表不同的对象可以指向同一个位置，但是，其中一个对象的next改变则所有对象的next都变化了
	 public ListNode oddEvenList(ListNode head) {
	        
			 if(head == null || head.next == null) {
				 return head;
			 }
			 ListNode evenHead = head.next;
			 ListNode odd = head;
			 ListNode even = evenHead;
			 
			 while(even != null && even.next !=null) {
				 odd.next = even.next;
				 odd = even.next;
				 even.next = odd.next;
				 even = even.next;
			 }
			 
			 odd.next = evenHead;
			 
			 return head;
			 }
}
