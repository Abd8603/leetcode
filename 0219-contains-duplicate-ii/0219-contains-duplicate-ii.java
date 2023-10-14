class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k == 0) return false;
        HashSet<Integer> check = new HashSet<Integer>();
        int len = 0;
        for(int i = 0; i < nums.length; i++){
            if(check.contains(nums[i])) return true;
            
            check.add(nums[i]);
            len++;
            if(len > k){
                check.remove(nums[i-k]);
                len--;
            }
        }
        return false;
    }
}