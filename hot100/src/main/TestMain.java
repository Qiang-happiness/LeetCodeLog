package main;
import questions.*;

import java.util.List;


public class TestMain {
    public static void main(String[] args) {
        MatrixRotate matrixRotate = new MatrixRotate();
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        matrixRotate.rotate2(matrix);
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
