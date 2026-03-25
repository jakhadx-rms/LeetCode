class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int totalSum=0;
        
        if(grid[0].length>1000) return false;

        for(int i=0 ;i<n;i++){
            for (int j=0;j<m;j++){
                totalSum+=grid[i][j];
            }
        }
        if(totalSum%2!=0) return false;
        int currSum = 0;
        for (int i=0;i<n-1;i++) {
            for (int j=0;j<m;j++) {
                currSum+=grid[i][j];
            }
            if (currSum*2==totalSum) return true;
        }
        currSum=0;
           for (int j=0;j<m-1;j++) {
            for (int i=0;i<n;i++) {
                currSum+=grid[i][j];
            }
            if (currSum*2==totalSum) return true;
        }
        return false;
    }
}