class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] tar = new int[1001];
        int[] ar = new int[1001];
        int v;
        for(int i = 0; i < target.length;i++){
            tar[target[i]]++;
            ar[arr[i]]++;
        }
        for(int i = 1; i < 1001;i++){
            if(tar[i] != ar[i])
                return false;
        }
        return true;
    }
}