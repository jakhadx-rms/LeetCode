class Solution {
    public List<Integer> findDuplicates(int[] nums) {
  
     HashMap<Integer,Integer> map = new HashMap<>();
    List<Integer> l = new ArrayList<>();
     for(int n : nums){
        if(map.containsKey(n)){
        l.add(n);
        }
        else{
            map.put(n,1);
        }
     }
    return l;
    }
}
