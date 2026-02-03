class Solution {
    public boolean isPerfectSquare(int num) {
        long left=1;
        long right=num;
        if(num==1) return true;
        while(left<=right){
            long mid=left+(right-left)/2;
            long midsq=mid*mid;
            if(midsq==num) return true;
            else if(midsq<num) left=mid+1;
             else right=mid-1;
        }
        return false;
    }
}
