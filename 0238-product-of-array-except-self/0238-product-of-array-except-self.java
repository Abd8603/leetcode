class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int left = 1;    //Left Side PRoduct
        int right = 1;   //Right Side Product
        for(int i = 0; i < nums.length; i++){
            result[i] = left;
            left *= nums[i];
        }
        for(int j = nums.length - 1; j >= 0 ; j--){
            result[j] *= right;
            right *= nums[j];
        }

        return result;
    }
}