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
        ListNode newHead = new ListNode(-1);
        newHead.next = head;
        ListNode front = newHead;
        while (front.next != null) {
            if (front.next.val == val) {
                front.next = front.next.next;
            } else {
                front = front.next;
            }
        }
        return newHead.next;
    }
}
