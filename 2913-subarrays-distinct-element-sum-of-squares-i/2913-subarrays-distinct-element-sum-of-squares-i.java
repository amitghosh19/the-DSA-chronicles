class Solution {
    public int sumCounts(List<Integer> nums) {
        int n = nums.size();
        int ans = 0;

        for(int i = 0; i<n; i++){
            HashSet<Integer> subset = new HashSet<>();

            for(int j = i; j<n; j++){
                subset.add(nums.get(j));
                int distinct = subset.size();
                ans += distinct*distinct;
            }
        }

        return ans;
        
    }
}