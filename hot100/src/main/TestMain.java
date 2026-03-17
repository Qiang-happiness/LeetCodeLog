package main;
import questions.*;

import java.util.List;


public class TestMain {
    public static void main(String[] args) {
        OutputMatrixOrdered outputMatrixOrdered = new OutputMatrixOrdered();
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> res = outputMatrixOrdered.spiralOrder(matrix);
        for(Integer num : res){
            System.out.print(num + " ");
        }
    }
}
