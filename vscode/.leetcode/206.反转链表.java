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
 * 复杂度分析： 时间复杂度：O(n)，如果链表的长度是n，需要循环n次； 空间复杂度：O(1)，只用到了2个变量；
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode reverse = null; // 保存逆序后的链表
        ListNode curr = head; // 遍历

        while (curr != null) {
            ListNode next = curr.next; // 用next保存当前节点后面的部分
            curr.next = reverse; // 使当前节点指向之前逆序后的链表
            reverse = curr; // 把当前节点作为逆序后的链表
            curr = next; // 继续下一次的遍历
        }

        return reverse;
    }
}
// @lc code=end
