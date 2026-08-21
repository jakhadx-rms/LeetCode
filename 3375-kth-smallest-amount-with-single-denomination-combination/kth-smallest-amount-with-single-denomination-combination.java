class Solution {

    public long findKthSmallest(int[] coins, int k) {

        int minCoin = coins[0];

        for (int coin : coins) {
            minCoin = Math.min(minCoin, coin);
        }

        long low = 1;
        long high = (long) minCoin * k;

        while (low < high) {

            long mid = low + (high - low) / 2;

            if (count(mid, coins) >= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private long count(long x, int[] coins) {

        int n = coins.length;
        long count = 0;

        for (int mask = 1; mask < (1 << n); mask++) {

            long lcm = 1;
            int bits = 0;

            for (int i = 0; i < n; i++) {

                if ((mask & (1 << i)) != 0) {

                    bits++;

                    lcm = lcm(lcm, coins[i]);

                    if (lcm > x) {
                        break;
                    }
                }
            }

            // No multiple of this LCM is <= x
            if (lcm > x) {
                continue;
            }

            long value = x / lcm;

            if (bits % 2 == 1) {
                count += value;
            } else {
                count -= value;
            }
        }

        return count;
    }

    private long lcm(long a, long b) {

        return (a / gcd(a, b)) * b;
    }

    private long gcd(long a, long b) {

        while (b != 0) {

            long temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }
}