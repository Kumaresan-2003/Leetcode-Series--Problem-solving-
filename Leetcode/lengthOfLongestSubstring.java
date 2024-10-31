//7 /longest-substring-without-repeating-characters/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res=0;
        for(int i=0;i<s.length();i++){
        boolean[] vi=new boolean[256];
        for(int j=i;j<s.length();j++){
            if(vi[s.charAt(j)]){
                break;
            }
            else{
                res=Math.max(res,j-i+1);
                vi[s.charAt(j)]=true;
            }
        }
        }
        return res;
    }
}