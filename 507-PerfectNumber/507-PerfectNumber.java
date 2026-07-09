// Last updated: 7/9/2026, 9:20:25 AM
class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0) sum+=i;
                
        }
        return sum==num;
    }
}