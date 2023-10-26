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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null) return null;
        ListNode doubl = head, singl = head, prev = null;
        while(doubl != null && doubl.next != null){
            doubl = doubl.next.next;
            prev = singl;
            singl = singl.next;
        }
        prev.next = prev.next.next;
        return head;
    }
}