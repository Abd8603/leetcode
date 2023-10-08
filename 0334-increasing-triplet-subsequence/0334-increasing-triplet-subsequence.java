class Solution {
    public boolean increasingTriplet(int[] nums) {
        int i = Integer.MAX_VALUE;
        int j = Integer.MAX_VALUE;
        int n = nums.length;
        for(int k = 0; k < n; k ++){
            if(nums[k]<=i) i = nums[k];
            else if(nums[k]<=j) j = nums[k];
            else return true;
        }
        return false;
    }
}