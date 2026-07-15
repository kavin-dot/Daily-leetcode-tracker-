// Last updated: 7/15/2026, 11:37:45 AM
1class Solution {
2    public int maxNumberOfBalloons(String text) {
3        int [] freq=new int[26];
4        for(char c: text.toCharArray()){
5            freq[c-'a']++;
6        }
7            int b = freq['b' - 'a'];
8            int a = freq['a' - 'a'];
9            int l = freq['l' - 'a'] / 2;
10            int o = freq['o' - 'a'] / 2;
11            int n = freq['n' - 'a'];
12        
13        return Math.min(Math.min(b,a),Math.min(l,Math.min(o,n)));
14}
15
16}