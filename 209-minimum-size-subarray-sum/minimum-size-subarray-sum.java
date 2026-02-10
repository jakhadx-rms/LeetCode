class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n= nums.length;
        int minLength = n+1;
        int left = 0;
        int sum = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum >= target && left <= right) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return minLength ==n+1 ? 0 : minLength;
    }
}