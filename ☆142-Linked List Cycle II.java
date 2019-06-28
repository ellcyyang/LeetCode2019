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

// https://leetcode.com/problems/linked-list-cycle-ii/discuss/44893/My-two-cents-still-O(1)-memory-and-O(n)-time


public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode a = head;
        ListNode b = head;
        while(b != null && b.next != null){
            a = a.next;
            b = b.next.next;
            
            if(a==b){
                ListNode c = head;
                while(a!=c){
                    a = a.next;
                    c = c.next;
                }
                return a;
            }
        }
        return null;
    }
}
