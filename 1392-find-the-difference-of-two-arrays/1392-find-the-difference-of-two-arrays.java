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
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        for(int j : st1){
            if(mp.get(j) == 1) ans.add(j);
        }
        answer.add(ans);
        List<Integer> ns = new ArrayList<>();
        for(int j : st2){
            if(mp.get(j) == 1) ns.add(j);
        }
        answer.add(ns);
        return answer;
    }
}