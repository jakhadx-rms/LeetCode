class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
       int n=citations.length;
    //     for(int i=citations[n-1];i>=0;i--){
    //         int count=0;
    //     for(int j=0;j<n;j++){
    //         if(citations[j]>=i){
    //             count++;
    //         }
    //     }
    //     if(count>=i){
    //         return i;
    //     }
    //     }

    for(int i=0;i<n;i++){
        if(citations[i]>=n-i){
            return n-i;
        }
    }
        return 0;
    }
}