class Solution {
    public int countGoodRotations(int[] nums) {
        int n = nums.length;
        int half = n / 2;
        int[] pel = nums;
        long total = 0;
        for(int num : pel){
            total += num;
        }
        long winSum = 0;
        for(int i = 0; i< half; i++){
            winSum += pel[i];
        }
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(winSum * 2 > total){
                ans++;
            }
            winSum -= pel[i];
            winSum += pel[(i + half) % n];
        }
        return ans;
    }
}