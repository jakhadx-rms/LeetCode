class Solution {
    public int missingNumber(int[] nums) {
  int sum=0 ;
  for(int i : nums){
    sum=sum^i;
  }
  for(int k =0;k<=nums.length;k++){
    sum=sum^k;
  }
  return sum;
    }
}