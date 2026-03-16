package questions;
//
//-2,1,-3,4,-1,2,1,-5,4


/**
 * 数组
 *  0   1   2  3   4  5  6   7   8
 * -2,  1, -3, 4, -1, 2, 1, -5, 4
 * -2,  1, -2, 4,  3, 5, 6, -1, 4
 */

public class MaxSubArraySum {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        int max = nums[0];
        dp[0] = nums[0];
        for(int i = 1; i < nums.length; i++)
        {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            if(dp[i] > max) max = dp[i];
        }
        return max;
    }
}
