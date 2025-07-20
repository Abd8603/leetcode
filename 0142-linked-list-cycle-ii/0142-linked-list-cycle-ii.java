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
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode curr = head;
        ListNode temp = head;
        while(temp != null && temp.next != null){
            curr = curr.next;
            temp = temp.next.next;
            if(curr == temp){
                curr = head;
                while(curr != temp){
                    curr = curr.next;
                    temp = temp.next;
                }
                return curr;
            }
        }
        return null;
    }
}