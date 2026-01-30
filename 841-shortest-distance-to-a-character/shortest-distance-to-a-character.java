class Solution {
    public int[] shortestToChar(String s, char c) {
        int n=s.length();
        int dis[]=new int[n];
        // int j=0;
        // for(int i=0;i<n;i++){
        //     dis[i]=1000;
        // }
        // for (int i=0; i<n; i++){
        //     if (s.charAt(i)==c){
        //         while (j<=i){
        //             dis[j] = Math.min(dis[j],i-j);
        //             j++;
        //         }
        //     }
        // }
        // j=n-1;
        // for (int i=n-1; i>=0; i--){
        //     if (s.charAt(i)==c){
        //         while (j>=i){
        //             dis[j]=Math.min(dis[j],j-i);
        //             j--;
        //         }
        //     }
        // }
        // return dis;

        int left=-1;
        for(int i=0;i<n;i++){
            if(c==s.charAt(i))
            left=i;
            if(left!=-1)
            dis[i]=i-left;
            else
            dis[i]=Integer.MAX_VALUE;
        }
        int r=n;
        for(int i=n-1;i>=0;i--){
           if(c==s.charAt(i))
           r=i;
           if(r!=n)
           dis[i]=Math.min(dis[i],r-i);
           else
           dis[i]=Math.min(dis[i],Integer.MAX_VALUE);
        }
        return dis;
    }
}