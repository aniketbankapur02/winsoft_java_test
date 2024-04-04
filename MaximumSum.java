class MaximumSum {
    public static int findMaxSum(int[] X, int[] Y) {
        int sum = 0;
        int sum_x = 0, sum_y = 0;

        int m = X.length, n = Y.length;

        int i = 0, j = 0;

        while (i < m && j < n) {
            if (X[i] == Y[j]) {
                sum += Math.max(sum_x, sum_y) + X[i];
                i++;
                j++;
                sum_x = 0;
                sum_y = 0;
            } else if (X[i] < Y[j]) {
                sum_x += X[i++];
            } else {
                sum_y += Y[j++];
            }
        }

        while (i < m) {
            sum_x += X[i++];
        }

        while (j < n) {
            sum_y += Y[j++];
        }

        sum += Math.max(sum_x, sum_y);
        return sum;
    }

    public static void main(String[] args) {
        int[] X = {3, 6, 7, 8, 10, 12, 15, 18, 100};
        int[] Y = {1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50};

        System.out.println("The maximum sum is " + findMaxSum(X, Y));
    }
}
