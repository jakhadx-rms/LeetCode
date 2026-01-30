class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        int m=matrix[0].length;
        PriorityQueue<Integer> proqu = new PriorityQueue<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            proqu.add(matrix[i][j]);
            }
            }
        int ans=0;
        while(k>0){
            ans=proqu.poll();
            k--;
        }
        return ans;
    }
}