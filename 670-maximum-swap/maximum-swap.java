class Solution {
    public int maximumSwap(int num) {
        int temp = num;
        int n = 0;
        while (temp > 0) {
            n++;
            temp /= 10;
        }
        int[] nums = new int[n];
        temp = num;
        for (int i = n - 1; i >= 0; i--) {
            nums[i] = temp % 10;
            temp /= 10;
        }
        for (int i = 0; i < n; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] >= nums[maxIndex]) {
                    maxIndex = j;
                }
            }
            if (nums[maxIndex] > nums[i]) {
                int tempDigit = nums[i];
                nums[i] = nums[maxIndex];
                nums[maxIndex] = tempDigit;
                break;
            }
        }
        int number = 0;
        for (int digit : nums) {
            number = number * 10 + digit;
        }
        return number;
        
    }
}
