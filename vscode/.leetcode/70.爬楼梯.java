/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        // 解法：第n层 = 第n-1层+1 + 第n-2层+2
        // 1: 1
        // 2: 1+1，2
        // 3: 1+1+1，2+1，1+2
        // 4: 1+1+1+1，2+1+1，1+2+1，1+1+2 ,2+2
        //(n): f(n-1）+ f(n-2)
        int a = 1, b = 2, c = 3;

        if (n == 1)
        return 1;
        if (n == 2)
        return 2;

        for (int i = 4; i <= n; i++) {
        a = b;
        b = c;
        c = a + b;
        }

        return c;

        //递归写法（时间复杂度超出）
        // if (n == 1)
        //     return 1;
        // if (n == 2)
        //     return 2;

        // return climbStairs(n - 1) + climbStairs(n - 2);

    }
}
// @lc code=end
