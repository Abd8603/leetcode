class Solution {
    public boolean isPowerOfFour(int n) {
        if (n == 1) return true;
        if (n <= 0) return false; 
        double answer = Math.log(n)/Math.log(4);
        return (answer == (int)answer);
    }
}