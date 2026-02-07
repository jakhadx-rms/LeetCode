// class Solution {
//     public int[] findErrorNums(int[] nums) {
//         int i = 0;
//         int n = nums.length;

//         while (i < n) {
//             int correctIndex = nums[i] - 1;

//             if (nums[i] != nums[correctIndex]) {
//                 int temp = nums[i];
//                 nums[i] = nums[correctIndex];
//                 nums[correctIndex] = temp;
//             } else {
//                 i++;
//             }
//         }

//         for (i = 0; i < n; i++) {
//             if (nums[i] != i + 1) {
//                 return new int[]{nums[i], i + 1};
//             }
//         }

//         return new int[]{-1, -1};
//     }
// }

class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        int duplicate = -1;
        int sum = 0;
        for (int num : nums) {
            if (set.contains(num)) {
                duplicate = num;
            } else {
                set.add(num);
                sum += num;
            }
        }
        int expectedSum = n * (n + 1) / 2;
        int missing = expectedSum - sum;

        return new int[]{duplicate, missing};
    }
}