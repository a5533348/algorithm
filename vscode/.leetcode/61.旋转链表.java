/*
 * @lc app=leetcode.cn id=61 lang=java
 *
 * [61] 旋转链表
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;
        ListNode mid = null;

        int i;
        for (i = -1; fast != null; i++) {
            if (i == k) {
                mid = fast;
            }
            fast = fast.next;
        }

        k %= i;
        while (mid != null) {
            mid = mid.next;
            slow = slow.next;
        }

        dummy.next = slow.next;
        slow.next = null;
        fast.next = head;

        return dummy.next;
    }
}
// @lc code=end
