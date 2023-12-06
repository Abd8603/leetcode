class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] x = new int[26];
        for(int i = 0; i < p.length(); i++){
            x[p.charAt(i) - 'a']++;
        }
        
        int[] y = new int[26];
        int start = 0;
        int end = 0;
        
        List<Integer> ans = new ArrayList<>();
        
        while(end < s.length()){
            y[s.charAt(end) - 'a']++;
            if(end - start + 1 == p.length()){
                if(check(x,y)) ans.add(start);
            }
            if(end - start + 1 < p.length()) end++;
            else{
                y[s.charAt(start) - 'a']--;
                start++;
                end++;
            }
        }
        return ans;
    }
    
    public boolean check(int[] x, int[] y){
        for(int i = 0; i < 26; i++){
            if(x[i] != y[i]) return false;
        }
        return true;
    }
}