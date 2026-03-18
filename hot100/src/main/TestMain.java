package main;
import questions.*;

import java.util.List;


public class TestMain {
    public static void main(String[] args) {
        SearchInMatrix searchInMatrix = new SearchInMatrix();
        int[][] matrix = new int[][]{
                {1,3,5,7,9},
                {2,4,6,8,10},
                {11,13,15,17,19},
                {12,14,16,18,20},
                {21,22,23,24,25}
        };
        int target = 0;
        boolean sign = searchInMatrix.searchMatrix(matrix, target);
        System.out.println(sign);
    }
}
