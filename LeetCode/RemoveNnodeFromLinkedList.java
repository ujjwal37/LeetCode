/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        ListNode curr = head;
        ListNode prev = null;
        while(temp != null){
            curr = temp;
            for(int i = 0; i < n; i++){
                curr = curr.next;
                if(curr == null){
                    if(temp == head){
                        head = head.next;
                        return head;
                    }
                         prev.next = temp.next; 
                      return head;
                    }
                  
                }
              
                prev = temp;
                temp = temp.next;
                
            }
        return head;
        }
    }
