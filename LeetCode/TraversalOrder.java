
public class Solution{
 public Node copyRandomList(Node head) {
        Map<Node, Node> mapping = new HashMap<>();
        Node copyHead = new Node();
        Node cur = head;
        Node copy = copyHead;
        // Copy the list keeping random references pointing back to the old list.
        while (cur != null) {
            copy.next = new Node(cur.val, cur.next, cur.random);
            copy = copy.next;
            // record mapping between old and new records.
            // since equals method is not defined map would use reference equality.
            // which is exactly what we want here.
            mapping.put(cur, copy);
            cur = cur.next;
        }
        cur = copyHead;
        // Now iterate through the list and substitute old random references with new ones.
        while (cur != null) {
            if (cur.random != null) cur.random = mapping.get(cur.random);
            cur = cur.next;
        }
        return copyHead.next;
    }
}