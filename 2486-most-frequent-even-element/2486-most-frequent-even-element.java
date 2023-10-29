class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i : nums){
            if(i % 2 == 0) mp.put(i, mp.getOrDefault(i, 0) + 1);
        }
        int count = 0;
        int curr = -1;
        for(Map.Entry<Integer, Integer> e : mp.entrySet()){
            if(e.getValue() > count){
                count = e.getValue();
                curr = e.getKey();
            }else if(e.getValue() == count){
                curr = (e.getKey() < curr)?e.getKey() : curr;
            }
        }
        return curr;
    }
}