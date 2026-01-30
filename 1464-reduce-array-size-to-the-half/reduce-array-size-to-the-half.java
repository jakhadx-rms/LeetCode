class Solution {
    public int minSetSize(int[] arr) {
        int n=arr.length;
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num:arr) {
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
          List<Integer> list = new ArrayList<>(freq.values());
          Collections.sort(list, Collections.reverseOrder());
          int sum=0;
          int count=0;
          for(int fq:list){
             sum+=fq;
             count++;
             if(sum>=n/2){
                return count;
             }
          }
          return 3;
    }
}