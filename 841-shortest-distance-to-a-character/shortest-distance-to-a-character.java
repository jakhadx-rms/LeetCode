class Solution {
    public int[] shortestToChar(String s, char c) {
        int n=s.length();
        int dis[]=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            dis[i]=1000;
        }
        for (int i=0; i<n; i++) {
            if (s.charAt(i)==c) {
                while (j<=i) {
                    dis[j] = Math.min(dis[j],i-j);
                    j++;
                }
            }
        }
        j=n-1;
        for (int i=n-1; i>=0; i--) {
            if (s.charAt(i)==c) {
                while (j>=i) {
                    dis[j]=Math.min(dis[j],j-i);
                    j--;
                }
            }
        }
        return dis;
    }
}