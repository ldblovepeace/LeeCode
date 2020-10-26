
class Q2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l = new ListNode();
        int length1 = 0;
        int length2 = 0;
        int num1 = 0;
        int num2 = 0;
        int r1 = 1;
        int r2 = 1;
        int result;
//        遍历两个listNode获得他们的长度
        while(l1.next.val >= 0) {
        	length1++;
        	num1 = num1+r1*l1.val;
        	r1=r1*10;
        	l1=l1.next;
        }
        while(l2.next.val >= 0) {
        	length2++;
        	num2 = num2+r2*l1.val;
        	r1=r2*10;
        	l1=l2.next;
        }
        
//        得到l1和l2对应的值
        result = num1 + num2;
        System.out.println(result);
        return l;
    }
}