/*
 * @lc app=leetcode.cn id=189 lang=java
 *
 * [189] 旋转数组
 * 时间复杂度：O(k*n)
 * 空间复杂度: O(1)
 */

// @lc code=start
class Solution {
    public void rotate(int[] nums, int k) {

        // 暴力破解法，循环k次,每次往右移动一位
        int prev, tmp;
        for (int i = 0; i < k; i++) {
            prev = nums[nums.length - 1];

            for (int j = 0; j < nums.length; j++) {
                // 将prev和nums[j]交换
                tmp = nums[j];
                nums[j] = prev;
                prev = tmp;
            }
        }

    }
}
// @lc code=end
