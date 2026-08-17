class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] ans = new String[words.length];

        for (String word : words) {
            int digit = word.charAt(word.length() - 1) - '0';
            String text = word.substring(0, word.length() - 1);

            ans[digit - 1] = text;
        }

        StringBuilder str = new StringBuilder();

        for (String word : ans) {
            str.append(word).append(" ");
        }
        return str.toString().trim();
    }
}