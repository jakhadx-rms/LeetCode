class Solution {
 static int pow(int k){
    if(k==0)
       return 1;
    int res=pow( k / 2);
      if (k % 2 == 1)
            return res * res * 2;
        else
            return res * res;
    }
    public boolean isPowerOfTwo(int n) {
        if (n<=0) return false;
        // int i=0;
        // while (true) {
        //     int value=pow(i);
        //     if (value==n)
        //         return true;
        //     if (value>n)
        //         return false;
        //     i++;
        // }
         return (n & (n - 1)) == 0;
    }
}
