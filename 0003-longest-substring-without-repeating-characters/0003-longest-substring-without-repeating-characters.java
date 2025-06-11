class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        Set<Character> st = new HashSet<>();
        int result = 0;
        int leng = 0;
        int n = s.length();
        for(int right = 0; right < n; right++){
            if(!st.contains(s.charAt(right))){
                st.add(s.charAt(right));
                leng = st.size();
                result = Math.max(leng,result); 
            }else{
                while(st.contains(s.charAt(right))){
                    st.remove(s.charAt(left++));
                }
                st.add(s.charAt(right));
            }
        }
        return result;
    }
}