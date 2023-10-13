class Solution {
    public int tribonacci(int n) {
        if(n==0 || n==1) return n;
        int a=0, b=1, c=1;
        int ans = 1;
        for(int i = 3; i <= n; i++){
            ans = a + b + c;
            a = b;
            b = c;
            c = ans;
        }
        return ans;
    }
}