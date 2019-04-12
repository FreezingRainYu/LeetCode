import static java.lang.Math.abs;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 *
 * @date 2019/04/11
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        int sizeA = 1;
        int sizeB = 1;
        ListNode curA = headA;
        ListNode curB = headB;
        while (curA.next != null) {
            curA = curA.next;
            sizeA++;
        }
        while (curB.next != null) {
            curB = curB.next;
            sizeB++;
        }
        if (curA != curB) {
            return null;
        }
        curA = headA;
        curB = headB;
        ListNode behind = (sizeA - sizeB) > 0 ? curA : curB;
        ListNode front = (sizeA - sizeB) > 0 ? curB : curA;
        for (int i = 0; i < abs(sizeA - sizeB); i++) {
            behind = behind.next;
        }
        while (front != behind) {
            front = front.next;
            behind = behind.next;
        }
        return front;
    }
}
