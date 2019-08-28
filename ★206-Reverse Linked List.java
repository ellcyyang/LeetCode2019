/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    //iterative way
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode nex;
        while(head!=null){
            nex = head.next;
            head.next = pre;
            pre = head;
            if(nex!=null)
                head = nex;
            else
                return head;
                
        }
        return head;
    }

    //recursive way
    // public ListNode reverseList(ListNode head) {
    //     return reverse(head, null);
    // }

    public ListNode reverse(ListNode head, ListNode nex){
        if(head==null) return nex;
        ListNode nextnode = head.next;
        head.next = nex;
        return reverse(nextnode, head);
    }
}
