class Solution {
    public int totalMoney(int n) {
        int count = 0;
        int sum = 0;
        while(n > 0){
            if(n > 7){
                sum += ((7+count)*(7+count+1)/2);
                if(count != 0){
                    sum -= count*(count+1)/2;
                }
                count++;
                n -= 7;
            }else{
                sum += ((n+count)*(n+count+1)/2);
                if(count != 0){
                    sum -= count*(count+1)/2;
                }
                n = 0;
            }
        }
        return sum;
    }
}