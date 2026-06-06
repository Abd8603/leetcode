class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leng = nums.length;
        int[] result = new int[leng];
        result[0] = 0;
        for(int i = 1; i < leng; i++){
            result[i] = result[i-1] + nums[i-1];
        }
        int checkSum = 0;
        for(int i = leng-2; i >= 0 ; i--){
            checkSum += nums[i+1];
            result[i] = Math.abs(result[i] - checkSum);
        }

        return result;
    }
}