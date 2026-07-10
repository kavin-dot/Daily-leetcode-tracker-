// Last updated: 7/10/2026, 11:45:10 AM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if(s.length()!=t.length()){
4            return false;
5         }
6        int freq[]=new int[26];   
7        for(int i=0;i<s.length();i++){
8           freq[s.charAt(i)-'a']++;
9           freq[t.charAt(i)-'a']--;
10        }
11        for(int i=0;i<26;i++){
12            if(freq[i]!=0){
13                return false;
14            }
15        }
16
17        return true;
18    }
19}