package questions;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class MaxSlidingWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int[] maxArray = new int[nums.length - k + 1];
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((o1, o2) -> o1[0] != o2[0] ? o2[0] - o1[0] : o2[1] - o1[1]);

        for(int i = 0; i < k; i++)
        {
            pq.offer(new int[]{nums[i], i});
        }
        maxArray[0] = pq.peek()[0];

        for(int i = k; i < nums.length; i++)
        {
            pq.offer(new int[]{nums[i], i});
            while(pq.peek()[1] <= i - k){
                pq.poll();
            }
            maxArray[i-k+1] = pq.peek()[0];
        }
        return maxArray;
    }
}
