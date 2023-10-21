class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int answer = 0;
        int zeros = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) zeros++;

            if(zeros > 1){
                zeros -=(nums[left] == 0 ? 1:0);
                left++;
            }
            answer = Math.max(answer,i - left);
        }
        return answer;
    }
}