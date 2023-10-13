class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<>());
        answer.get(0).add(1);
        for(int i = 1 ; i < rowIndex + 1; i++){
            List<Integer> ans = new ArrayList<>();
            ans.add(1);
            for(int j = 1; j < i; j++){
                ans.add(answer.get(i-1).get(j-1) + answer.get(i-1).get(j));
            }
            ans.add(1);
            answer.add(ans);
        }
        return answer.get(rowIndex);
    }
}