/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 *
 * @date 2019/04/11
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        int size = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            size++;
        }
        tail.next = head;
        for (int i = 0; i < (size - k % size); i++) {
            head = head.next;
        }
        while (tail.next != head) {
            tail = tail.next;
        }
        tail.next = null;
        return head;
    }
}
