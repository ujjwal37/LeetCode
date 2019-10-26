/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        
        ListNode curr = head;
        ListNode prev =null;
    
        while(m > 1){
             prev = curr;
             curr = curr.next;
             m--;
             n--;
        }
        ListNode tail = curr, con = prev;
        ListNode third = null;
        while(n > 0){
            third = curr.next;
            curr.next = prev;
            prev = curr;
            curr = third;
            n--;
        }
        
        if(con != null){
            con.next = prev;
        }else{
            head = prev;
        }
        tail.next = curr;
        return head;
        
    }
}