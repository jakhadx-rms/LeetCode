class Solution {
    public int largestAltitude(int[] gain) {
        int []arr = new int[gain.length + 1];
        int sum = 0;
        arr[0] = sum;
        int k = 1;
        int max = 0;
        for(int i = 0; i < gain.length; i++){
            sum=sum+gain[i];
            arr[k]=sum;
            k++;
        }
        for(int i = 0; i < arr.length; i++){
            max = Math.max(max,arr[i]);
        }
        return max;
    }
}