class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] tar = new int[1001];
        for(int i = 0; i < target.length;i++){
            tar[target[i]]++;
            tar[arr[i]]--;
        }
        for(int i = 1; i < 1001;i++){
            if(tar[i] != 0)
                return false;
        }
        return true;
    }
}