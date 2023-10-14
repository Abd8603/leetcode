class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int end = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;
        int len = 0;

        while(end < nums.length){
            sum += nums[end];
            len ++;
            while(sum >= target && start <= end){
                result = Math.min(result, len);
                sum -= nums[start];
                start++;
                len--;
            }
            end++;
        }
        if(result == Integer.MAX_VALUE) return 0;
        return result;
    }
}