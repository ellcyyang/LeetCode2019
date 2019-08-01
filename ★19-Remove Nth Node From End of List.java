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
        int count = 0;
        ListNode start = new ListNode(1);
        ListNode pre = start, cur = start;
        pre.next = head;
        for(int i = 0; i <= n; i++){
            cur = cur.next;
        }
        while(cur!=null){
            pre = pre.next;
            cur = cur.next;
        }
        pre.next = pre.next.next;
        return start.next;
    }
}