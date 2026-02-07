class Solution {
    public boolean isAnagram(String  Str1 , String  Str2) {

        // char[] str1 = s.toCharArray();
        // char[] str2 = t.toCharArray();

        // if (str1.length != str2.length) return false;

        // Arrays.sort(str1);
        // Arrays.sort(str2);

        // for (int i = 0; i < str1.length; i++) {
        //     if (str1[i] != str2[i]) {
        //         return false;
        //     }
        // }
        // Str1 = Str1.replace(" ", "").toLowerCase();
        // Str2 = Str2.replace(" ", "").toLowerCase();
        char[] str1 = Str1.toCharArray();
        char[] str2 = Str2.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        if(Arrays.equals(str2,str1)){
        return true;
        }
        else{
            return false;
        }
    }
}
