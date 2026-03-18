// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {

//         HashMap<String, List<String>> map = new HashMap<>();

//         for (String s : strs) {
//             char[] arr = s.toCharArray();
//             Arrays.sort(arr);
//             String key = new String(arr);
//             map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
//         }
//         return new ArrayList<>(map.values());
//     }
// }

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            StringBuilder key = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                key.append('#');    
                key.append(count[i]);
            }
            String finalkey = key.toString();
            if(!map.containsKey(finalkey)){
                map.put(finalkey,new ArrayList<String>());
            }
            map.get(finalkey).add(s);
        }
        return new ArrayList<>(map.values());
    }
}