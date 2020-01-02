/*
 * @lc app=leetcode.cn id=189 lang=java
 *
 * [189] 旋转数组
 * 时间复杂度：O(n)
 * 空间复杂度：O(1)
 */

// @lc code=start
class Solution {
    public void rotate(int[] nums, int k) {

        // 原数组[1,2,3,4,5,6,7]
        // 1.逆序[7,6,5,4,3,2,1]
        // 2.将前k个逆序[5,6,7,4,3,2,1]
        // 3.将k+1开始逆序[5,6,7,1,2,3,4]
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;

            start++;
            end--;
        }

    }
}
// @lc code=end
