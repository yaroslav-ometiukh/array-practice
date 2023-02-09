public class MatrixAddition {
    public static int[][] addMatrix(int[][] first, int[][] second) {
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[i].length; j++) {
                first[i][j] += second[i][j];
            }
        }
        return first;
    }
}
