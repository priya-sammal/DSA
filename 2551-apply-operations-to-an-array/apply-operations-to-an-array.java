class Solution {
    public int[] applyOperations(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
        }
       int insertPos = 0; // position to insert non-zero elements
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[insertPos] = nums[i];
                if (insertPos != i) {
                    nums[i] = 0; // set old position to 0
                }
                insertPos++;
            }
        }
        
        return nums;
    }
}