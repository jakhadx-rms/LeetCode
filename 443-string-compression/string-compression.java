class Solution {
    public int compress(char[] chars) {

        char[] nums = new char[chars.length];
        int k = 0;

        for (int i = 0; i < chars.length; i++) {
            int count = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    count++;
                } 
                else{
                    break;
                }
            }
            nums[k++] = chars[i];

            if (count > 1) {
                 String countStr = String.valueOf(count);
    for (int l = 0; l < countStr.length(); l++) {
        nums[k++] = countStr.charAt(l);
    }
            }
            i = i + count-1; 
        }
        for (int i = 0; i < k; i++) {
            chars[i] = nums[i];
        }
        return k;
    }
}