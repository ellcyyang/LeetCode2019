/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
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
}