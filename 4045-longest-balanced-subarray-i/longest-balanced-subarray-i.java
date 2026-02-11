class Solution {
    public int longestBalanced(int[] nums) {
     int ans=0;
     for(int i=0;i<nums.length;i++){
        HashSet<Integer> Evn=new HashSet<>();
        HashSet<Integer> Odd=new HashSet<>();
        for(int j=i;j<nums.length;j++){
            if(nums[j]%2==0){
                Evn.add(nums[j]);
            }
            else{
                Odd.add(nums[j]);
            }
            if(Evn.size()==Odd.size()){
                ans=Math.max(ans,j-i+1);
            }
        }
     }
     return ans;
    }
}