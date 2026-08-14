class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int ans = 0;

        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);

            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);

            while (map.get(rightChar) > 1 && left < s.length()) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.getOrDefault(leftChar, 0) - 1);
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}