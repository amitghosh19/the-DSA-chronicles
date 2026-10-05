class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int i = 0; int j =1;
        int[] result = new int[n];

        for(int l = 0; l< n; l++){
            if(nums[l] > 0){
                result[i] = nums[l];
                i+=2;
            }else{
                result[j] = nums[l];
                j+=2;
            }
        }

        return result;
    }
}