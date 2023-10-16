class Solution {
    public int[] countBits(int n) {
        int[] answer = new int[n+1];
        for(int i = 0; i <= n; i++){
            int count = 0;
            int k = i;
            while(k > 0){
                if(k%2 != 0) count++;
                k /= 2;
            }
            answer[i] = count;
        }
        return answer;
    }
}