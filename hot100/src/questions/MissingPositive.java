package questions;

public class MissingPositive {
    public int firstMissingPositive(int[] nums) {
        int min = nums[0];
        for(int num : nums)
        {
            if(num == 1) min = num;
        }
        if (min != 1) return 1;

        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] <= 0 || nums[i] > nums.length) nums[i] = 1;
        }

        for (int i = 0; i < nums.length; i++)
        {
            nums[Math.abs(nums[i]) - 1] = -Math.abs(nums[Math.abs(nums[i]) - 1]);
        }

        min = nums.length + 1;
        for (int i = 0; i < nums.length; i++)
        {
            if(nums[i] > 0)
            {
                min = i + 1;
                break;
            }
        }
        return min;
    }
}
