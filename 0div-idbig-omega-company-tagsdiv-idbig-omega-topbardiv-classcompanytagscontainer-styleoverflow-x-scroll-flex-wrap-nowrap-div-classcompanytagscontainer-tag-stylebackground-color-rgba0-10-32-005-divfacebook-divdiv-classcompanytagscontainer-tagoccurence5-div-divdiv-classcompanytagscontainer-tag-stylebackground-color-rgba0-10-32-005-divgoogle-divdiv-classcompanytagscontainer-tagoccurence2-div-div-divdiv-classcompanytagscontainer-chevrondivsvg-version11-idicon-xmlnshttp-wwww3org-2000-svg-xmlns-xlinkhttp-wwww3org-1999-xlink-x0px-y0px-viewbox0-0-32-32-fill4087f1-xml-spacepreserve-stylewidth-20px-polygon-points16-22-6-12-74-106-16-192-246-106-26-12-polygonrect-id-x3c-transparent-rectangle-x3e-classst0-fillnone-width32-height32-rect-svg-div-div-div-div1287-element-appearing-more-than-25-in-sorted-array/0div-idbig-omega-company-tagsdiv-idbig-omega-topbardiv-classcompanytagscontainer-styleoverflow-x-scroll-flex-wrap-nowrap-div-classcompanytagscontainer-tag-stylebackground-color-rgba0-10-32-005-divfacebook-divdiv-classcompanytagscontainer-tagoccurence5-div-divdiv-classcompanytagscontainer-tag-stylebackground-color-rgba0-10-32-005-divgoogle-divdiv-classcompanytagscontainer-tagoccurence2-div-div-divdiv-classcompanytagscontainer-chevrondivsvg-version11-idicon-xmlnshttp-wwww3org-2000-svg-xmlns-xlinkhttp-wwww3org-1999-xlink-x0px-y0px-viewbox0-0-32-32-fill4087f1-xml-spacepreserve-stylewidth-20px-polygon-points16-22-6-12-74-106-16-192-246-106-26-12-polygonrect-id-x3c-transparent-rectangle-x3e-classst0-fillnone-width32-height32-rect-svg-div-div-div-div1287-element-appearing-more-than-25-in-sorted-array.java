class Solution {
    public int findSpecialInteger(int[] arr) {
        int check = (arr.length)/4;
        int count = 0;
        int curr = -1;
        for(int i : arr){
            if(i == curr){
                count++;
            }else{
                curr = i;
                count = 1;
            }
            if(count > check) return i;
        }
        return curr;
    }
}