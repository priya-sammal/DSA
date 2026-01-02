class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum = nums[0];
        int csum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            csum = Math.max(nums[i], csum + nums[i]);
            maxsum = Math.max(maxsum, csum);
        }
        return maxsum;
    }
}
