// class Solution {
//     public List<Integer> findDuplicates(int[] nums) {

//         List<Integer> result = new ArrayList<>();

//         for (int i = 0; i < nums.length; i++) {
//             int index = Math.abs(nums[i]) - 1;

//             if (nums[index] < 0) {
//                 result.add(index + 1); 
//             } else {
//                 nums[index] = -nums[index];
//             }
//         }

//         return result;
//     }
// }

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            if (set.contains(num)) {
                result.add(num);
            } else {
                set.add(num);
            }
        }
        return result;
    }
}
