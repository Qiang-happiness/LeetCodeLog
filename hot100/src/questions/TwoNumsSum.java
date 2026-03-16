package questions;

import java.util.HashMap;

public class TwoNumsSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            //hashmap为 空时，直接放入，key为要找的数，value为当前下标
            if (hashMap.isEmpty()){
                hashMap.put(target-nums[i], i);
            }
            //遍历时在hashmap中找到要找的数，返回两数下标
            else if (hashMap.containsKey(nums[i])){
                return new int[]{i, hashMap.get(nums[i])};
            }
            //若没找到，继续放入hashmap
            hashMap.put(target-nums[i], i);
        }
        return null;
    }
}
