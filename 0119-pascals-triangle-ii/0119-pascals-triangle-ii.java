class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> answer = new ArrayList<>();
        answer.add(1);
        long prev = 1;
        for(int i = 0; i < rowIndex; i++){
            prev *= (rowIndex - i);
            prev /= (i+1);
            answer.add((int) prev);
        }
        return answer;
    }
}