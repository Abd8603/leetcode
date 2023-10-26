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
    int count = 0;
    public ListNode deleteMiddle(ListNode head) {
        int n = traverse(head, 0);
        if( n == 1){
            head = head.next;
            return head;
        }
        solve(head, n/2);
        return head;
    }
    public int traverse(ListNode head, int n){
        if(head.next == null) return 1;
        return traverse(head.next, n) + 1;
    }
    public void solve(ListNode head, int n){
        if(count == n - 1){
            ListNode temp = head.next;
            head.next = temp.next;
            return ;
        }
        count ++;
        solve(head.next, n);
    }
}