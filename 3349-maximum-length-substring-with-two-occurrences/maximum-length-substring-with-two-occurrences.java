class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();

        int left = 0;
        int ans = 0;

        for (int right = 0; right < s.length(); right++) {

            char rightCh = s.charAt(right);

            freq.put(rightCh,freq.getOrDefault(rightCh, 0) + 1);

            while (freq.get(rightCh) > 2) {

                char leftChar = s.charAt(left);

                freq.put(leftChar,freq.getOrDefault(leftChar, 0) - 1);

                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}