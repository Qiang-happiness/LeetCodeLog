package questions;

import java.util.HashMap;

public class SubarraySumK {
    public int subarraySum(int[] nums, int k) {
        if(nums.length == 0) return 0;

        int count = 0, pre = 0;
        HashMap<Integer, Integer> preMap = new HashMap<>();
        preMap.put(0, 1); //自身
        for (int num : nums) {
            pre += num;
            if (preMap.containsKey(pre - k)) {
                count += preMap.get(pre - k);
            }
            preMap.put(pre, preMap.getOrDefault(pre, 0) + 1);
        }
        return count;
    }
}
