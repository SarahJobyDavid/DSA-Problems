class Solution {
    public boolean canJump(int[] nums) {
        int finalPos = nums.length-1;
        for(int i=nums.length-1; i>=0; i--){
            if(nums[i] + i >= finalPos){
                finalPos = i;
            }
        }  
        return finalPos == 0;      
    }
}