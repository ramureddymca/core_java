public class SaddlePoint{
    public static void main(String[] args) {
        int [][] arr = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        System.out.println(findSaddlePoint(arr, 3));
    }

    private static int findSaddlePoint(int[][] arr, int n) {
        for (int i = 0; i < n; i++) {
            int min_row = arr[i][0], col_index = 0;

            for (int j = 1; j < n; j++) {

                if (min_row > arr[i][j]) {
                    min_row = arr[i][j];
                }
            }
            int k;
            for (k = 0; k < n; k++) {
                if (min_row < arr[k][col_index]) {
                    break;
                }
            }
            if (k == n) return min_row;
        }
            return 0;

    }
}
