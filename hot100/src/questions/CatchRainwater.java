package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatchRainwater {
    public int trap(int[] height) {
        //记录最大高度下标
        int max = 0;
        for(int num : height)
        {
            if (num > max) max = num;
        }
        if(height.length < 3 || max == 0) return  0;

        List<Integer> maxIndex = new ArrayList<>();
        int rainwater = 0;
        int index = 0;
        for(int i = 0; i < height.length; i++)
        {
            if(height[i] == max) maxIndex.add(i);
        }

        int left = maxIndex.getFirst();
        int right = maxIndex.getLast();

        int first = 0;
        int last = height.length - 1;

        //最高点左边
        while(first < left)
        {
            while(first < height.length - 1 && height[first] <= height[first+1]) first++;
            if (first >= height.length - 1) break;
            int min = height[first+1];  //记录最低点
            for(int second = first + 1; second <= left; second++)
            {
                if(height[second] < min) min = height[second];
                else if(height[second] >= height[first])
                {
                    int temp = (height[first] - min) * (second - first - 1);
                    for (int i = first + 1; i < second; i++)
                    {
                        temp -= (height[i] - min);
                    }
                    rainwater += temp;
                    first = second;
                }
            }
        }

        //最高点右边
        while(last > right)
        {
            while(last > 0 && height[last] <= height[last-1]) last--;
            if(last <= 0) break;

            int min = height[last-1];  //记录最低点
            for(int second = last - 1; second >= right; second--)
            {
                if(height[second] < min) min = height[second];
                else if(height[second] >= height[last])
                {
                    int temp = (height[last] - min) * (last - second - 1);
                    for (int i = last - 1; i > second; i--)
                    {
                        temp -= (height[i] - min);
                    }
                    rainwater += temp;
                    last = second;
                }
            }
        }

        //最高点中间
        int temp = (right - left - 1) * max;
        if(temp > 0)
        {
            for(int i = left + 1; i < right; i++)
            {
                temp -= height[i];
            }
            rainwater += temp;
        }
        return  rainwater;
    }
}
