class Solution {
    public int climbStairs(int n) {
        if(n==1 || n==2) return n;
        int a = 1, b = 2, answer = 0, i=3;
        while(i <= n){
            answer = a + b;
            a = b;
            b = answer;
            i ++;
        }
        return answer;
    }
}