package questions;

import java.util.ArrayList;
import java.util.List;

public class MatrixSetZeros {
    public void setZeroes(int[][] matrix) {
        int rowLength = matrix.length;
        int columnsLength = matrix[0].length;
        List<Integer> rows = new ArrayList<>();
        List<Integer> columns = new ArrayList<>();

        for (int i = 0; i < rowLength; i++)
        {
            for(int j = 0; j < columnsLength; j++)
            {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    columns.add(j);
                }
            }
        }

        for(int row : rows)
        {
            for(int column = 0; column < columnsLength; column++)
            {
                matrix[row][column] = 0;
            }
        }

        for(int column : columns)
        {
            for(int row = 0; row < rowLength; row++)
            {
                matrix[row][column] = 0;
            }
        }
    }
}
