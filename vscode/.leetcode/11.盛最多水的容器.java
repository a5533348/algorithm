/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 * 
 * 暴力破解
 * 时间复杂度O(n^2)
 * 空间复杂度O(1)
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {

        int maxArea = 0;
        for (int i = 0; i < height.length - 1; i++) {

            for (int j = i + 1; j < height.length; j++) {
                int minHeight = Math.min(height[i], height[j]);
                int area = (j - i) * minHeight;
                maxArea = Math.max(area, maxArea);
            }
        }

        return maxArea;
    }
}
// @lc code=end
