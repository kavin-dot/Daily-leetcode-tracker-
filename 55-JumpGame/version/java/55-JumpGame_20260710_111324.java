// Last updated: 7/10/2026, 11:13:24 AM
1class Solution {
2    public boolean canJump(int[] nums) {
3        int far=0;
4        for(int i=0;i<nums.length;i++){
5            if(i>far){
6                return false;
7            }
8            far=Math.max(far,i+nums[i]);
9        }
10        return true;
11    }
12}