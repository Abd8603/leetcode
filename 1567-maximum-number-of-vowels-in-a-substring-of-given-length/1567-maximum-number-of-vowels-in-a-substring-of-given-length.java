class Solution {
    public int maxVowels(String s, int k) {
        String examp = "aeiou";
        int i;
        int count = 0;
        for(i = 0; i < k; i++){
            if(examp.indexOf(s.charAt(i)) != -1) count++;
        }
        int maa = count;
        for(i = k; i < s.length(); i++){
            if(examp.indexOf(s.charAt(i)) != -1) count++;

            if(examp.indexOf(s.charAt(i-k)) != -1) count--;

            maa = (maa > count)?maa:count;
        }
        return maa;
    }
}