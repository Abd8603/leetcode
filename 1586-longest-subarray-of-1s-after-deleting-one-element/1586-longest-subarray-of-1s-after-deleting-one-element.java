class Solution {
    public int longestSubarray(int[] nums) {
        int answer = 0;
        int leftsum = 0; 
        int rightsum = 0;
        int sum = 0;
        int  j = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                if(j == -1){
                    j = i;
                    leftsum = rightsum;
                    rightsum = 0;
                }else{
                    sum = leftsum + rightsum;
                    answer = (answer > sum) ? answer : sum;
                    leftsum = rightsum;
                    rightsum = 0;
                    j = i;
                }
            }else{
                rightsum++;
                System.out.println("ran");
            }
        }
        sum = leftsum + rightsum;
        if(j == -1) sum--;
        answer = (answer > sum) ? answer : sum;
        return answer;
    }
}