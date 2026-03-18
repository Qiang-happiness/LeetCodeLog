package questions;

public class SearchInMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
//        boolean find = false;
        int row = 0, column = matrix[0].length - 1;
        while (row < matrix.length && column >= 0){
            if (matrix[row][column] == target) return true;
            else if (matrix[row][column] > target) column--;
            else row++;
        }
        return false;
    }
}
