package Questions.Q200;

import common.ListNode;

public class Q148 {
    public ListNode sortList(ListNode head) {
//        插入排序 时间复杂度n^2
        ListNode index = head;
        ListNode tmp = head;
        while(index.next!=null) {
            if(index.next.val >= index.val) {
                index = index.next;
            }else {
                if(index.next.val < head.val) {
                    tmp = index.next;
                    index.next = index.next.next;
                    tmp.next = head;
                    head = tmp;    
                }else {
                    ListNode insertIndex = head;
                    while(insertIndex.next != null) {
                        if(insertIndex.next.val <= index.next.val) {
                            insertIndex = insertIndex.next;
                        } else {
                            tmp = insertIndex.next;
                            insertIndex.next = index.next;
                            index.next = index.next.next;
                            insertIndex.next.next = tmp;
                            break;
                        }
                    }
                }
            }
        }
        return head;
    }
    
    public ListNode mergeSort(ListNode head) {
        
        if(head == null || head.next == null) {
            return head;
        }
        
        ListNode mid = getMiddleNode(head);
        ListNode right = mergeSort(mid.next);
        mid.next = null;
        ListNode left = mergeSort(head);
        head = mergeList(left,right);
        return head;
    }
    
    public ListNode getMiddleNode(ListNode head) {
        if(head == null) {
            return head;
        }        
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast!=null && fast.next!= null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    
    public ListNode mergeList(ListNode left, ListNode right) {
        ListNode head = new ListNode(0);
        ListNode leftIndex = left;
        ListNode rightIndex = right;
        
        
        ListNode index = head;
        
        while(leftIndex != null && rightIndex != null) {
            if(leftIndex.val <= rightIndex.val) {
                index.next = leftIndex;
                leftIndex = leftIndex.next;
                index = index.next;
                continue;
            }
            if(leftIndex.val > rightIndex.val){
                index.next = rightIndex;
                rightIndex = rightIndex.next;
                index = index.next;
                continue;
            }
        }
        
        if(leftIndex == null) {
            index.next = rightIndex;
            return head.next;
        }
        
        if(rightIndex == null) {
            index.next = leftIndex;
            return head.next;
        }
        
        return head.next;
    }
}
