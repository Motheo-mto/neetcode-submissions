/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;
        ListNode curr = head;
        ListNode prev = head;
        while(curr != null && curr.next != null)
        {
            prev = prev.next;
            curr = curr.next.next;
            if(prev == curr) return true;
        }
        return false;
    }
}
