class Solution {
    public void solve(int i, int[] candidates, List<List<Integer>> ans, List<Integer> temp, int t) {
        if (t == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        if (i == candidates.length) {
            return;
        }
        for (int j = i; j < candidates.length; j++) {
            if (j > i && candidates[j] == candidates[j - 1]) {
                continue;
            }
            if (t >= candidates[j]) {
                temp.add(candidates[j]);
                solve(j + 1, candidates, ans, temp, t - candidates[j]);
                temp.remove(temp.size() - 1);
            }
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        solve(0, candidates, ans, new ArrayList<>(), target);
        return ans;
    }
}