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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;

        ListNode second = head;
        ListNode first = head;
        while(first != null && first.next != null)
        {
            second = second.next;
            first = first.next.next;
        }

        ListNode prev = null;
        ListNode curr = second.next;
        second.next = null;

        while(curr != null)
        {
            ListNode nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }

        ListNode firstHalf = head;
        ListNode secondHalf = prev;
        while(secondHalf != null)
        {
            ListNode temp1 = firstHalf.next;
            ListNode temp2 = secondHalf.next;

            firstHalf.next = secondHalf;
            secondHalf.next = temp1;

            firstHalf = temp1;
            secondHalf = temp2;
        }
    }
}
