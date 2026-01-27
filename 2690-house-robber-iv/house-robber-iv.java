class Solution {
    public int minCapability(int[] nums, int k) {
        int l = Integer.MAX_VALUE;
        int r = Integer.MIN_VALUE;
        for (int num : nums) {
            l = Math.min(l, num);
            r = Math.max(r, num);
        }
        int ans=r;
        while (l<=r) {
            int mid=l+(r-l)/2;
            if (check(nums,k,mid)) {
                ans=mid;
                r=mid-1;
            } else {
                l=mid+1;
            }
        }
        return ans;
    }
    public boolean check(int[] nums,int k,int mid) {
        int count=0;
        int i=0;
        while (i<nums.length) {
            if (nums[i]<=mid) {
                count++;
                i+=2; 
            } else {
                i++;
            }
        }
        return count>=k;
    }
}
