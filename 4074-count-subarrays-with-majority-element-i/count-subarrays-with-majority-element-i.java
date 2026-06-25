class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            int fq = 0;
            int ln = 0;
            for(int j = i; j < nums.length; j++){
                ln++;
                if(nums[j] == target){
                    fq++;
                }
                if(fq>ln/2){
                    count++;
                }
            }
        }  
        return count;     
    }
}