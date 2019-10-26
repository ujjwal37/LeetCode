/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        int count = 0;
        ListNode curr= head;
        ListNode prev = new ListNode(0);
        ListNode node = prev;
        prev.next = curr;
           
          if(head == null) return null;
        while(curr != null && curr.next != null){
            if(curr.val != curr.next.val){
                prev = curr;
                curr = curr.next;
            }else{
                while(curr.next != null && curr.val == curr.next.val){
                    curr= curr.next;
                }
                prev.next = curr.next;
                curr = curr.next;
            }
                 
    }
        return node.next;
}
}