/*
 * @lc app=leetcode.cn id=75 lang=java
 *
 * [75] 颜色分类
 */

// @lc code=start
class Solution {
    public void sortColors(int[] nums) {
        //三路快排
        //设置2个下标l,r
        //[0,l]表示0;[r,length -1]表示2;[l+1,r-1]表示1
        //1.如果i遍历等于0，则将nums[i]与nums[++l]交换，i+1；
        //2.如果i遍历等于1，则i++；
        //3.如果i遍历等于2，则将nums[i]与nums[--r]交换；

        //时间复杂度O(n)
        //空间复杂度O(1)
        int l = -1; // [0,l] 
        int r = nums.length; // [r,length - 1]

        int i = 0;
        while(i < r){
            if(nums[i] == 0){
                nums[i++] = nums[++l];
                nums[l] = 0;
            }else if(nums[i] == 2){
                nums[i] = nums[--r];
                nums[r] = 2; 
            }else{
                i++;
            }

        }
    }
}
// @lc code=end

