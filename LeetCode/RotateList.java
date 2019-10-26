/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
     
        if(head == null)
            return null;
        
        if(head.next == null) 
            return head;
        
        ListNode curr = head;
        
        int lenght = 1;
        while(curr.next != null){
             curr = curr.next;
            lenght++;
        }
        
        int realrotate= lenght - (k%lenght);
        
        curr.next = head;
        
        for(int i = 0 ;  i < realrotate; i++){
            head = head.next;
            curr = curr.next;
        }
            curr.next = null;
        return head;
}
}