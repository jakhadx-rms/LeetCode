class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int left = 0;
        int currentCost = 0;
        int maxLen = 0;
        for (int right = 0; right < s.length(); right++) {
            currentCost += Math.abs(s.charAt(right) - t.charAt(right));
            while (currentCost > maxCost) {
                currentCost -= Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
