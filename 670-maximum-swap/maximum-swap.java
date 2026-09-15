class Solution {
    public int maximumSwap(int num) {
       int n = 0;
       int temp = num;
       while(temp > 0){
        n++;
        temp /= 10;
       }
       int nums[] = new int[n];
       for(int i = n - 1; i >= 0; i--){
           nums[i] = num % 10;
            num /= 10;
       }
       int suffixmax[] = new int[n];
       suffixmax[n - 1] = n - 1;
       for(int i = n - 2; i >= 0; i--){
        int next = suffixmax[i + 1];
        if(nums[i] > nums[next]){
            suffixmax[i] = i;
        }
        else{
            suffixmax[i] = next;
        }
       }
       for(int i = 0; i < n - 1; i++){
        int maxind = suffixmax[i + 1];
        if(nums[maxind] > nums[i]){
            int t = nums[maxind];
            nums[maxind] = nums[i];
            nums[i] = t;
            break;
        }
       }
       int nber = 0;
       for(int i = 0; i < n; i++){
        nber = nber * 10 + nums[i];
       }
       return nber;
    }
}
