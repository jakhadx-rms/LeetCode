class Solution {

    public static int solve(int[] stoneValue, int i, int j, int[][] dp, int[] prefix) {

        if (i == j) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int ans = 0;

        for (int k = i; k < j; k++) {

            int leftSum = prefix[k + 1] - prefix[i];
            int rightSum = prefix[j + 1] - prefix[k + 1];

            int candidate;

            if (leftSum < rightSum) {

                candidate = leftSum
                        + solve(stoneValue, i, k, dp, prefix);

            } else if (rightSum < leftSum) {

                candidate = rightSum
                        + solve(stoneValue, k + 1, j, dp, prefix);

            } else {

                candidate = leftSum
                        + Math.max(
                            solve(stoneValue, i, k, dp, prefix),
                            solve(stoneValue, k + 1, j, dp, prefix)
                        );
            }

            ans = Math.max(ans, candidate);
        }

        return dp[i][j] = ans;
    }

    public int stoneGameV(int[] stoneValue) {

        int n = stoneValue.length;

        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        int[] prefix = new int[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + stoneValue[i];
        }

        return solve(stoneValue, 0, n - 1, dp, prefix);
    }
}