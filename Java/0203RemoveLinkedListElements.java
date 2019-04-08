/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 *
 * @date 2019/04/08
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode newHead = new ListNode(Integer.MAX_VALUE);
        newHead.next = head;
        ListNode front = newHead;
        ListNode current = newHead.next;
        while (current != null) {
            if (current.val == val) {
                front.next = current.next;
            } else {
                front = current;
            }
            current = current.next;
        }
        return newHead.next;
    }
}
