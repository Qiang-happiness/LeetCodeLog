package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeArea {
    public int[][] merge(int[][] intervals) {
        List<int[]> mergeArea = new ArrayList<>();
        int[][] tempArea = new int[intervals.length][2];
        int index = 0;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        tempArea[0][0] = intervals[0][0];
        tempArea[0][1] = intervals[0][1];
        for(int i = 1; i < intervals.length; i++)
        {
           if(intervals[i][0] > tempArea[index][1]) {
               mergeArea.add(tempArea[index]);
               index++;
               tempArea[index][0] = intervals[i][0];
               tempArea[index][1] = intervals[i][1];
           }else {
               tempArea[index][1] = Math.max(intervals[i][1], tempArea[index][1]);
           }
        }
        mergeArea.add(tempArea[index]);
        return mergeArea.toArray(new int[0][]);
    }
}
