/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

 // mine:

public class Solution {
    public boolean hasCycle(ListNode head) {

        if(head == null)
            return false;
        ListNode a = head;
        ListNode b = head;
        int step = 2;
        do{
            int i = 0;
            if(a.next!=null)
                a = a.next;
            while(i < step){
                if(b.next!=null)
                    b = b.next;
                else
                    return false;
                i++;
            }
        }while(a!=b);
        return true;
    }
}

// best:

public boolean hasCycle(ListNode head) {
    if(head==null) return false;
    ListNode walker = head;
    ListNode runner = head;
    while(runner.next!=null && runner.next.next!=null) {
        walker = walker.next;
        runner = runner.next.next;
        if(walker==runner) return true;
    }
    return false;
}