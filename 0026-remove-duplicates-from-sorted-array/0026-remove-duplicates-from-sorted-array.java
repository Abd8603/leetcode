class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> st1 = new TreeSet<>();
        for(int n : nums) st1.add(n);
        int i = 0;
        for(int n : st1){
            nums[i] = n;
            i++;
        }
        return i;
    }
}