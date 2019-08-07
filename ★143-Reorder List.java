/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if(head==null||head.next==null) return;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode pre = slow;
        ListNode cur = slow.next;
        ListNode tmp = cur.next;
        while(cur.next!=null){
            tmp = cur.next;
            cur.next=tmp.next;
            tmp.next=pre.next;
            pre.next=tmp;
        }
        slow=head;
        fast=pre.next;
        while(slow!=pre){
            pre.next=fast.next;
            fast.next=slow.next;
            slow.next=fast;
            slow=fast.next;
            fast=pre.next;
        }
        
    }
}