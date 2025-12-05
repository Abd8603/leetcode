class Solution {
    public int countPartitions(int[] nums) {
        int suffixSum = 0;
        int prefixSum = 0;
        int count = 0;
        for(int n : nums){
            suffixSum += n;
        }
        for(int i = 0; i < nums.length-1; i++){
            int n = nums[i];
            prefixSum += n;
            suffixSum -= n;
            if((prefixSum - suffixSum) % 2 == 0){
                count++;
            }

        }
        return count;

    }
}