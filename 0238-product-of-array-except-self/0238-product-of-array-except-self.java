class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int left_pro = 1;
        int right_pro= 1;

        for(int i = 0; i < (nums.length); i++){
            ans[i]= left_pro;
            left_pro *= nums[i];
        }

        for(int i = (nums.length-1); i >=0 ; i--){
            ans[i]*= right_pro;
            right_pro *= nums[i];
        }
        return ans;
        
    }
}