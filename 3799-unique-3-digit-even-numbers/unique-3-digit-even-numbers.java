class Solution {
    public int totalNumbers(int[] digits) {
        // int[] freq = new int[10];
        // for (int d : digits) {
        //     freq[d]++;
        // }
        // int ans = 0;
        // for (int first = 1; first <= 9; first++) {
        //     if (freq[first] == 0) continue;
        //     freq[first]--;
        //     for (int second = 0; second <= 9; second++) {
        //         if (freq[second] == 0) continue;
        //         freq[second]--;
        //         for (int third = 0; third <= 8; third += 2) {
        //             if (freq[third] > 0) {
        //                 ans++;
        //             }
        //         }
        //         freq[second]++;
        //     }
        //     freq[first]++;
        // }
        // return ans;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {
                    if (i == j || j == k || i == k) {
                        continue;
                    }
                    int num = digits[i] * 100
                            + digits[j] * 10
                            + digits[k];
                    if(num % 2 == 0 &&  String.valueOf(num).length() == 3){
                      set.add(num);
                    }
                }
            }
        }
        return set.size();
    }
}