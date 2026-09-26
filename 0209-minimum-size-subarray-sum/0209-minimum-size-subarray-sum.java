class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int min_length = Integer.MAX_VALUE;

        for(int right = 0; right < nums.length; right++){
            sum += nums[right];
            while(sum>=target){
                min_length = Math.min(min_length, right-left+1);

                sum -= nums[left];
                left++;
            }
        }

        return min_length==Integer.MAX_VALUE ? 0 : min_length;
    }
}