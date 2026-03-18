// class Solution {
//     public boolean canConstruct(String ransomNote, String magazine) {
//         HashMap < Character, Integer > map1 = new HashMap < > ();
//         HashMap < Character, Integer > map2 = new HashMap < > ();

//         for (char c: ransomNote.toCharArray()) {
//             if (map1.containsKey(c)) {
//                 map1.put(c, map1.get(c) + 1);
//             } else {
//                 map1.put(c, 1);
//             }
//         }
//         for (char c: magazine.toCharArray()) {
//             if (map2.containsKey(c)) {
//                 map2.put(c, map2.get(c) + 1);
//             } else {
//                 map2.put(c, 1);
//             }
//         }
//         for(char c : ransomNote.toCharArray()){
//              if (!map2.containsKey(c) || map2.get(c) < map1.get(c)) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
            // if(map.containsKey(c)){
            //     map.put(c,map.get(c)+1);
            // }
            // else{
            //     map.put(c,1);
            // }
        }

        for (char c : ransomNote.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) {
                return false;
            }
            map.put(c, map.get(c) - 1);
        }

        return true;
    }
}