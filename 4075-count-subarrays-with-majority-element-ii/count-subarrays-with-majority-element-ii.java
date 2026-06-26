import java.util.*;

class Solution {
    public long countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int[] prefix = new int[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + (nums[i] == target ? 1 : -1);
        }

        int[] sorted = prefix.clone();
        Arrays.sort(sorted);

        Map<Integer, Integer> compress = new HashMap<>();
        int rank = 1;

        for (int x : sorted) {
            if (!compress.containsKey(x)) {
                compress.put(x, rank++);
            }
        }

        Fenwick bit = new Fenwick(rank + 2);
        long ans = 0;

        for (int x : prefix) {
            int r = compress.get(x);
            ans += bit.query(r - 1);
            bit.update(r, 1);
        }

        return ans;
    }
}

class Fenwick {
    long[] bit;

    Fenwick(int n) {
        bit = new long[n + 1];
    }

    void update(int i, long val) {
        while (i < bit.length) {
            bit[i] += val;
            i += i & -i;
        }
    }

    long query(int i) {
        long sum = 0;
        while (i > 0) {
            sum += bit[i];
            i -= i & -i;
        }
        return sum;
    }
}