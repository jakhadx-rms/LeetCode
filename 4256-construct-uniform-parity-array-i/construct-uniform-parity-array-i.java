class Solution {
    public boolean uniformArray(int[] nums1) {
       int n = nums1.length;
        boolean hasEven = false;
        boolean hasOdd = false;
        for (int num : nums1) {
            if (num % 2 == 0) {
                hasEven = true;
            } else {
                hasOdd = true;
            }
        }
        if (hasEven && !hasOdd) {
            return true;
        }if (!hasEven && hasOdd) {
            return true;
        }
        return true;
    }
}