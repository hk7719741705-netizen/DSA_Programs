public class SubtractMatrix {
    public static void main(String[] args) {
        int[][] A = {{5, 6, 7}, {8, 9, 10}};
        int[][] B = {{1, 2, 3}, {4, 5, 6}};
        int[][] diff = new int[2][3];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                diff[i][j] = A[i][j] - B[i][j];
            }
        }

        System.out.println("Difference of matrices:");
        for (int[] row : diff) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}

