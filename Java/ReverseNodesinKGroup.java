

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dum = new ListNode(0,head);
        ListNode cur = head;
        ListNode prev = dum;
        
        while(cur!=null)
        {
            ListNode tail = cur;
            int index =0;
            
            while(cur!=null && index<k)
            {
                cur = cur.next;
                index++;
            }
            
            if(index!=k)
            {
                prev.next = tail; 
            }
            else
            {
                prev.next = reverse(tail,k);
                prev =tail;
            }
        }
            
        return dum.next;
    }
    
    private ListNode reverse(ListNode head, int k)
    {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        while (current != null && k-->0)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }
}