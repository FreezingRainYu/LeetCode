/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 *
 * @date 2019/04/09
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode c1 = new ListNode(-1);
        ListNode c2 = new ListNode(-1);
        c1.next = l1;
        c2.next = l2;
        int carry = 0;
        while (c1.next != null && c2.next != null) {
            c1.next.val = c1.next.val + c2.next.val + carry;
            if (c1.next.val > 9) {
                c1.next.val -= 10;
                carry = 1;
            } else {
                carry = 0;
            }
            c1 = c1.next;
            c2 = c2.next;
        }
        if (c1.next == null && c2.next == null) {
            if (carry == 0) {
                return l1;
            }
            ListNode n = new ListNode(carry);
            c1.next = n;
            return l1;
        } else {
            ListNode cur = (c1.next != null) ? c1 : c2;
            while (cur.next != null) {
                cur.next.val += carry;
                if (cur.next.val > 9) {
                    cur.next.val -= 10;
                    carry = 1;
                } else {
                    carry = 0;
                }
                cur = cur.next;
            }
            if (carry != 0) {
                ListNode n = new ListNode(carry);
                cur.next = n;
            }
            if (c1.next == null && c2.next != null) {
                c1.next = c2.next;
            }
            return l1;
        }
    }
}
