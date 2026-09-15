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
        int[] suffixMax = new int[n];
        suffixMax[n - 1] = n - 1;
        for (int i = n - 2; i >= 0; i--) {
            int next = suffixMax[i + 1];
            if (nums[i] > nums[next]) {
                suffixMax[i] = i;
            } else {

                suffixMax[i] = next;
            }
        }
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = suffixMax[i + 1];
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
