/*
 * @lc app=leetcode.cn id=206 lang=java
 *
 * [206] 反转链表
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 * 
 * 复杂度分析: 时间复杂度：O(n)，长度为n，需要递归n次； 空间复杂度：O(n)，由于使用递归，将会使用隐式栈空间。递归深度可能会达到n层。
 */
class Solution {

    // 首先根据递归终止条件，找到最后一个节点；
    // 然后从尾部改变节点的指向
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return p;
    }
}
// @lc code=end
