/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode result = new ListNode(0);
        result.next = head;
        ListNode pre = head;
        if(head==null||head.next==null) return head;
        head = head.next;
        while(head!=null){
            if(pre.val==head.val){
                pre.next = head.next;
            }else{
                pre = pre.next;
            }
            head = head.next;
        }
        
        return result.next;
    }
}