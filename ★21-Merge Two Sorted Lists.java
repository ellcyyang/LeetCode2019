/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

// Try both iterative and recursive ways

// iterative

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode a = l1;
        ListNode b = l2;
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        ListNode result = new ListNode(0);
        ListNode pre = result;

        while(a!=null&&b!=null){
            int va = a.val;
            int vb = b.val;
            if(va>=vb){
                pre.next = b;
                b = b.next;
            }else{
                pre.next = a;
                a = a.next;
            }
            pre = pre.next;
        }
        if(a!=null)
            pre.next = a;
        if(b!=null)
            pre.next = b;
        return result.next;
    }
}

//recursice

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        if(l1.val <= l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }else{
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }        
    }
}