class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
       int n=citations.length;
        for(int i=citations[n-1];i>=0;i--){
            int count=0;
        for(int j=0;j<n;j++){
            if(citations[j]>=i){
                count++;
            }
        }
        if(count>=i){
            return i;
        }
        }
        return 0;
    }
}