class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> st1 = new HashSet<Integer>();
        for(int i : nums1){
            st1.add(i);
        }
        Set<Integer> st2 = new HashSet<Integer>();
        for(int i : nums2){
            st2.add(i);
        }
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for(int i : st1){
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }
        for(int i : st2){
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }
        for(int j : nums1){
            if(mp.get(j) != 1) st1.remove(j);
        }
        for(int j : nums2){
            if(mp.get(j) != 1) st2.remove(j);
        }
        return Arrays.asList(new ArrayList<>(st1), new ArrayList<>(st2));
    }
}