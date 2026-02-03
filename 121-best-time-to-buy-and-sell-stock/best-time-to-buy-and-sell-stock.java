class Solution {
    public int maxProfit(int[] arr) {
       /* int n= prices.length;
        int max =0;
        for (int i=0; i<n-1; i++){
            for (int j=i+1; j<n; j++){
                int profit= prices[j]-prices[i];
                if (max<profit)
                max = profit;
            }
        }
        */

      int minipro=arr[0];
      int maxpro=0;
      for(int i=0; i<arr.length ;i++){
        if(arr[i]<minipro){
            minipro=arr[i];
        }
        else{
         maxpro=Math.max(maxpro,arr[i]-minipro);
        }

      }
      return maxpro;
        
    }
}