class Solution {
    public boolean isPowerOfFour(int n) {
        if(n == 1) return true;
        if(n < 1) return false;
        return solve(n);
    }
    public boolean solve(int n){
        if(n == 1) return true;
        if(n%4 != 0) return false;

        return solve(n/4);
    }
}