package questions;

import java.util.ArrayList;
import java.util.List;

public class OutputMatrixOrdered {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rowHead = 0, rowTail = matrix.length - 1;
        int columnHead = 0, columnTail = matrix[0].length - 1;
        int turn = 0; //turn 代表方向，0：从左到右，，，1：从上到下，，，2：从右到左，，，3：从下到上
        int[] nowLocation = new int[]{0, 0};
        List<Integer> res = new ArrayList<>();
        while(rowHead <= rowTail && columnHead <= columnTail){
            switch (turn){
                case 0:
                    for (int i = columnHead; i <= columnTail; i++){
                        res.add(matrix[nowLocation[0]][i]);
                        nowLocation[1] = i;
                    }
                    rowHead++;
                    turn = 1;
                    break;
                case 1:
                    for (int i = rowHead; i <= rowTail; i++){
                        res.add(matrix[i][nowLocation[1]]);
                        nowLocation[0] = i;
                    }
                    columnTail--;
                    turn = 2;
                    break;
                case 2:
                    for (int i = columnTail; i >= columnHead; i--){
                        res.add(matrix[nowLocation[0]][i]);
                        nowLocation[1] = i;
                    }
                    rowTail--;
                    turn = 3;
                    break;
                case 3:
                    for (int i = rowTail; i>= rowHead; i--){
                        res.add(matrix[i][nowLocation[1]]);
                        nowLocation[0] = i;
                    }
                    columnHead++;
                    turn = 0;
                    break;
            }
        }
        return res;
    }
}
