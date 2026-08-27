class Solution {

    public String lexGreaterPermutation(String s, String target) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        int n = s.length();
        for (int i = n - 1; i >= 0; i--) {
            int[] temp = freq.clone();
            boolean possible = true;
            for (int j = 0; j < i; j++) {
                int c = target.charAt(j) - 'a';
                if (temp[c] == 0) {
                    possible = false;
                    break;
                }
                temp[c]--;
            }
            if (!possible) {
                continue;
            }
            int current = target.charAt(i) - 'a';
            for (int c = current + 1; c < 26; c++) {
                if (temp[c] > 0) {
                    StringBuilder ans = new StringBuilder();
                    ans.append(target, 0, i);
                    ans.append((char) ('a' + c));
                    temp[c]--;
                    for (int x = 0; x < 26; x++) {
                        while (temp[x] > 0) {
                            ans.append((char) ('a' + x));
                            temp[x]--;
                        }
                    }

                    return ans.toString();
                }
            }
        }
        return "";
    }
}