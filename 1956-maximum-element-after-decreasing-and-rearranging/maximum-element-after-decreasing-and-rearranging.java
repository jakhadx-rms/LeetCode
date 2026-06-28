class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int count = 0;
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > count){
                count++;
            }
        }
        return count;
    }
}