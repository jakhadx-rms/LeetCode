class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Set<Integer> set = new HashSet<>();

        // for (int num : nums) {
        //     if (set.contains(num)) {
        //         return true; 
        //     }
        //     set.add(num);
        // }
        // return false; 

       Set<Integer> set = new HashSet<>();
       for(int i:nums){
         if(set.contains(i)){
            return true;
         }
         set.add(i);
       }
       return false;
    }
}