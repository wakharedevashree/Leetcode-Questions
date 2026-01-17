class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        int n = matrix.length;
        int m = matrix[0].length;

        int startRow = 0, endRow = n - 1;
        int startCol = 0, endCol = m - 1;

        while (startRow <= endRow && startCol <= endCol) {

            // Top row
            for (int col = startCol; col <= endCol; col++) {
                res.add(matrix[startRow][col]);
            }

            // Right column
            for (int row = startRow + 1; row <= endRow; row++) {
                res.add(matrix[row][endCol]);
            }

            // Bottom row
            if (startRow < endRow) {
                for (int col = endCol - 1; col >= startCol; col--) {
                    res.add(matrix[endRow][col]);
                }
            }

            // Left column
            if (startCol < endCol) {
                for (int row = endRow - 1; row > startRow; row--) {
                    res.add(matrix[row][startCol]);
                }
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }

        return res;
    }
}
