class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        while(l1 != null){
            s1.push(l1.val);
            l1 = l1.next;
        }
        while(l2 != null){
            s2.push(l2.val);
            l2 = l2.next;
        }
        int carry = 0;
        int d = 0;
        ListNode curr = new ListNode(0);
        ListNode temp = curr;
        while(!s1.isEmpty() || !s2.isEmpty() || d>0){
            int v1 = s1.isEmpty() ? 0:s1.pop();
            int v2 = s2.isEmpty() ? 0:s2.pop();
            int sum = d + v1 + v2;
            if(sum>=10){
                sum -= 10;
                carry++;
            }
            temp.next = new ListNode(sum);
            d = carry;
            carry = 0;
            temp = temp.next;
        }
        
            return reverse(curr.next);
    }
    public ListNode reverse(ListNode head){
        ListNode node = head;
        ListNode prev = null;
        while(node != null){
            ListNode next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }
        return prev;
    }
}