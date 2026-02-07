class Solution {
    public List<String> printVertically(String s) {
        List<String> ans= new ArrayList<>();
        String[] words = s.split(" ");
        int maxlen=0;
        for(String str:words){
            maxlen=Math.max(maxlen,str.length());
        }
        for(int i=0;i<maxlen;i++){
            StringBuilder strb=new StringBuilder();
            for(String word:words){
                if(i<word.length()){
                    strb.append(word.charAt(i));
                }
                else{
                    strb.append(' ');
                }
            }
            int end=strb.length()-1;
            while(end>=0&&strb.charAt(end)==' '){
                end--;
            }
            ans.add(strb.substring(0,end+1));
        }
        return ans;
    }
}