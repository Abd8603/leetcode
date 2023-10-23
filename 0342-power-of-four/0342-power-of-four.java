class Solution {
    public boolean isPowerOfFour(int n) {
        double answer = Math.log(n)/Math.log(4);

        return (answer == (int)answer);
    }
}