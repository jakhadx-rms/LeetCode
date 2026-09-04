class Solution {
    public int minSubArrayLen(int target, int[] nums) {
    int n = nums.length;
    int minLength = n + 1;
    int sum = 0;
    int left = 0;

    for(int i = 0; i < n; i++){
        sum += nums[i];

        while(sum >= target && left <= i){
            minLength = Math.min(minLength , i - left + 1);
            sum -= nums[left];
            left++;
        }
    }
    return minLength == n + 1 ? 0 : minLength;
    }
}