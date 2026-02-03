class Solution {
    public boolean isPerfectSquare(int num) {
        long sum=0;
        for (long i=1;i<=num;) {
             sum+=i;
             if(sum==num){
                return true;
             }
             i+=2;
        }
        return false;
    }
}
