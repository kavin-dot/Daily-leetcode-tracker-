// Last updated: 7/13/2026, 9:26:42 AM
1class Solution {
2    public int reverse(int x) {
3        int rev = 0;
4
5        while (x != 0) {
6            int digit = x % 10;
7            x = x / 10;
8
9            if (rev > Integer.MAX_VALUE / 10 || 
10                (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
11                return 0;
12            }
13
14            if (rev < Integer.MIN_VALUE / 10 || 
15                (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
16                return 0;
17            }
18
19            rev = rev * 10 + digit;
20        }
21
22        return rev;
23    }
24}