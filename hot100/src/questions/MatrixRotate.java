package questions;

import java.util.HashMap;

public class MatrixRotate {
    public void rotate(int[][] matrix) {
        int[] nums = new int[matrix.length * matrix[0].length];
        int index = 0;
        HashMap<Integer, Integer[]> map = new HashMap<>();
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                nums[index] = matrix[i][j];
                map.put(index, new Integer[]{j, matrix.length - 1 - i});
                index++;
            }
        }

        for (int i = 0; i < nums.length; i++){
            matrix[map.get(i)[0]][map.get(i)[1]] = nums[i];
        }
    }

    //以下是优化后的解法
    public void rotate2(int[][] matrix){
        int n = matrix.length - 1;
        int left = 0, right = n;
        while (left < right){
            for (int i = left; i < right; i++){
                swap(matrix, left, i, i, n - left);
                swap(matrix, left, i, n - left, n - i);
                swap(matrix, left, i, n - i, left);
            }
            left++;
            right--;
        }
    }

    public void swap(int[][] matrix, int aX, int aY, int bX, int bY){
        int temp = matrix[bX][bY];
        matrix[bX][bY] = matrix[aX][aY];
        matrix[aX][aY] = temp;
    }
}
