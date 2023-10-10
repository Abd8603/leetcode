class Solution {
    public int pivotIndex(int[] nums) {
        int[] suffix = new int[nums.length];
        suffix[nums.length - 1] = 0;
        for(int i = nums.length - 2; i >= 0;i--){
            suffix[i] = suffix[i+1] + nums[i+1];
        }
        int sum = 0; 
        for(int i = 0; i < nums.length; i++){
            if(suffix[i] == sum) return i;

            sum += nums[i];
        }
        
        
        return -1;
    }
}