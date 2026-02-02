class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        List<List<Integer>> ans = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for (int[] q : queens) {
            set.add(q[0] + "," + q[1]);
        }
        int[] dr={-1,-1,-1,0,0,1,1,1};
        int[] dc={-1,0,1,-1,1,-1,0,1};
        for (int d=0;d<8;d++) {
            int x=king[0];
            int y=king[1];
            while (true) {
                x+=dr[d];
                y+=dc[d];
                if (x<0||y<0||x>=8||y>=8) break;
                if (set.contains(x + "," + y)) {
                    ans.add(Arrays.asList(x, y));
                    break; 
                    }
            }
        }
        return ans;
    }
}
