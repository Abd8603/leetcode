class Solution {
    public int numberOfMatches(int n) {
        int matches = 0;
        while(n > 1){
            if((n&1) == 0){
                n = n>>1;
                matches += n;
            }else{
                n = n >>1;
                matches += (n + 1);
            }
        }
        return matches;
    }
}