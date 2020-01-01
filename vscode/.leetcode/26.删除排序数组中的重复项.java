/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除排序数组中的重复项
 */

// @lc code=start

/**
 * 时间复杂度：O(n)
 * 空间复杂度：O(1)
 * 
 * 快指针i和快指针j，如果nums[i]==nums[j]则跳过继续；
 * 如果不相等则表示重复项已结束，将nums[i] = nums[j];
 * 最终返回i + 1；
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }
}
// @lc code=end
