package main;
import questions.*;

import java.util.List;


public class TestMain {
    public static void main(String[] args) {
        MatrixSetZeros matrixSetZeros = new MatrixSetZeros();
        int[][] matrix = new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        matrixSetZeros.setZeroes(matrix);
        for(int row = 0; row < matrix.length; row++)
        {
            for (int column = 0; column < matrix[0].length; column++)
            {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }
}
