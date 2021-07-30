class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        
        int k = lists.length;
        if(k==0)
            return null;
        if(k==1)
            return lists[0];
        
        List<ListNode> arr = new ArrayList<>();
        for(ListNode x:lists)
            arr.add(x);
        for(int i=0;i<arr.size()-1;i++)
        {
            ListNode cur = arr.get(i);
            ListNode nex = arr.get(i+1);
            ListNode merge = mergeTwoLists(cur,nex);
            arr.remove(i);
            arr.remove(i);
            arr.add(merge);
            i=-1;
        }
        return arr.get(0);
        
    }
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode last = dummy;
        while(true)
        {
        if(l1==null)
        {
            last.next = l2;
            break;
        }
        if(l2==null)
        {
            last.next = l1;
            break;
        }
        
        if(l1.val <= l2.val)
        {
            last.next = l1;
            l1 = l1.next;
        }
        else
        {
            last.next = l2;
            l2 = l2.next;
        }
        last = last.next;
        }
        
        return dummy.next;
    }
}

