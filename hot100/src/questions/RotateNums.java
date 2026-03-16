package questions;

public class RotateNums {
    /**
     * 输入: nums = [1,2,3,4,5,6,7], k = 3
     * 输出: [5,6,7,1,2,3,4]
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {
        int[] temp = new int[k];
        k = k % nums.length;
        for(int i = nums.length - k; i < nums.length; i++)
        {
            temp[i - nums.length + k] = nums[i];
        }

        for(int i = nums.length - k - 1; i >= 0; i--)
        {
            nums[i + k] = nums[i];
        }

        for(int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }
}
