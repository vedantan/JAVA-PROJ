public class no6 {
    public static void main(String[] args) {
        int[][] M1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int[][] M2 = { {9, 8, 7}, {6, 5, 4}, {3, 2, 1} };

        int[][] finalMatrix = multiplyMatrices(M1, M2);

        matrixMultiplication(finalMatrix);
    }

    public static int[][] multiplyMatrices(int[][] M1, int[][] M2) {
        int rowFirst = M1.length;
        int colFirst = M1[0].length;
        int colSecond = M2[0].length;

        int[][] resultMatrix = new int[rowFirst][colSecond];

        for (int i = 0; i < rowFirst; i++) {
            for (int j = 0; j < colSecond; j++) {
                for (int k = 0; k < colFirst; k++) {
                    resultMatrix[i][j] += M1[i][k] * M2[k][j];
                }
            }
        }

        return resultMatrix;
    }

    public static void matrixMultiplication(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
