class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        int m = l.length;
        List<Boolean> ans = new ArrayList<Boolean>(m);
        int left,right;
        for(int i = 0; i < m; i++){
            left = l[i];
            right = r[i];
            int[] arr = Arrays.copyOfRange(nums, left, right + 1);
            if((right - left) < 1){
                ans.add(false);
                continue;
            }
            Arrays.sort(arr);
            int sum = arr[1] - arr[0];
            int j = 1;
            boolean bl = true;
            while(j < arr.length - 1){
                if(sum != (arr[j+1] - arr[j])){
                    bl = false;
                    break;
                }
                j++;
            }
            ans.add(bl);
                        
        }
        return ans;
    }
}