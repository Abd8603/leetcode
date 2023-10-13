class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<>());
        answer.get(0).add(1);
        for(int i = 1 ; i < numRows; i++){
            List<Integer> ans = new ArrayList<>();
            ans.add(1);
            for(int j = 1; j < i; j++){
                ans.add(answer.get(i-1).get(j-1) + answer.get(i-1).get(j));
            }
            ans.add(1);
            answer.add(ans);
        }
        return answer;
        
    }
}