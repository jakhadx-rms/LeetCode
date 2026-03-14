class Solution {
    public int smallestBalancedIndex(int[] nums) {
        int n=nums.length;
        long leftSum = 0;

        // for (int i=0;i<n;i++) {
        //     long rightProd=1;
        //     for (int j=i+1;j<n;j++) {
        //         rightProd*=nums[j];
        //         if(rightProd>leftSum) break;
        //     }
        //     if (leftSum==rightProd) {
        //         return i;
        //     }
        //     leftSum+=nums[i];
        // }

        for(int i=0;i<n;i++){
            leftSum+=nums[i];
        }
        long rightProduct=1;
        for(int i=n-1;i>=0;i--){
            leftSum-=nums[i];
            if(leftSum==rightProduct)
                return i;
            rightProduct*=nums[i];
            if (rightProduct>leftSum && leftSum>=0)
                break;
            if (rightProduct > Long.MAX_VALUE / nums[i])
                break; 
        }
        return -1;
    }
}