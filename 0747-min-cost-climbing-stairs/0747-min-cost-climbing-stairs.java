class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int i = 2;
        while(i < cost.length){
            cost[i] += Math.min(cost[i-1], cost[i-2]);
            i++;
        }
        return Math.min(cost[i-1], cost[i-2]);
    }
}