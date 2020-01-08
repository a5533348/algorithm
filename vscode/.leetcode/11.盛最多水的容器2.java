/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 * 时间复杂度：O(n)
 * 空间复杂度: O(1)
 * 两侧向中间收敛，较小的一方收
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {

        int i = 0;
        int j = height.length - 1;
        int maxArea = 0;

        while (i < j) {
            int minHeight = height[i] < height[j] ? height[i++] : height[j--];
            maxArea = Math.max(maxArea, (j - i + 1) * minHeight);
        }

        return maxArea;
    }
}
// @lc code=end
