// Last updated: 7/9/2026, 9:20:15 AM
class Solution {
    public int[] runningSum(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
        sum=sum+nums[i];
        nums[i]=sum;
        }
        return nums;
    }
}