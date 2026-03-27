class Solution {
    public int splitArray(int[] nums, int k) {
        int low = nums[0];
        int high = 0;
        for (int i = 0; i < nums.length; i++) {
            high += nums[i];
            low = Math.max(low, nums[i]);
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int subarrays = 1;
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                if (sum > mid) {
                    subarrays++;
                    sum = nums[i];
                }
            }
            if (subarrays > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}
