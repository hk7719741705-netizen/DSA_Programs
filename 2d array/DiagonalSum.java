public class DiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int primary = 0, secondary = 0;
        for (int i = 0; i < matrix.length; i++) {
            primary += matrix[i][i];
            secondary += matrix[i][matrix.length - 1 - i];
        }

        System.out.println("Primary diagonal sum: " + primary);
        System.out.println("Secondary diagonal sum: " + secondary);
    }
}

