class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> st = new ArrayList<String>();
        int j = 0;
        int i = 1;
        while(j < target.length && i <= n){
            if(target[j] == i){
                j++;
                st.add("Push");
            }else{
                st.add("Push");
                st.add("Pop");
            }
            i++;
        }
        return st;
    }
}