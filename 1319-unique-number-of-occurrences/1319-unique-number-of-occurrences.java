class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> mp = new HashMap<Integer, Integer>();
        for(int i : arr){
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }
        Set<Integer> st = new HashSet<Integer>();
        for(Map.Entry<Integer, Integer> e : mp.entrySet()){
            st.add(e.getValue());
        }
        return (mp.size() == st.size());
    }
}