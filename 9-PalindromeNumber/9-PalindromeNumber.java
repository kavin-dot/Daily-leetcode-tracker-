// Last updated: 7/9/2026, 9:21:06 AM
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int original=x;
        int y=x;
        int reverse=0;
        while(y!=0){
            int digit=y%10;
            reverse=reverse*10+digit;
            y=y/10;
        }
        return original==reverse;
    }
}

