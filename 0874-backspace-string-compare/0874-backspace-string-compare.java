class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1;
        int j = t.length() - 1;
        while(i >= 0 || j >= 0){
            int count1 = 0;
            while(i >= 0 ){
                if(s.charAt(i) == '#'){
                    count1++;
                    i--;
                }
                else if(count1 != 0){
                    count1--;
                    i--;
                }
                else break;
            }
            int count2 = 0;
            while(j >= 0){
                if(t.charAt(j) == '#'){
                    count2++;
                    j--;
                }
                else if(count2 != 0){
                    count2--;
                    j--;
                }
                else break;
            }
            if(i >= 0 && j >= 0 && s.charAt(i) != t.charAt(j)) return false;
            if((i >= 0) != (j >= 0 )) return false;
            i--;
            j--;
        }

        return true;
    }
}