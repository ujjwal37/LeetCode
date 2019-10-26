/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        
        
        if(head == null || head.next == null)
            return head;
        
    ListNode prev  = null;
    ListNode slow = head;
     ListNode fast = head;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
    prev.next = null;
         
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);
        
    
    return mergeList(l1 , l2);
    }
    ListNode mergeList(ListNode l1 , ListNode l2){
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while(l1  != null && l2 != null){
            if(l1.val  > l2.val){
                prev.next = l2;
                l2 = l2.next;
            }else{
                prev.next = l1;
                l1 = l1.next;
            }
            prev = prev.next;
            }
        if(l1 != null) prev.next = l1;
        if(l2 != null) prev.next = l2;
        
        return dummy.next;
    } 
    }