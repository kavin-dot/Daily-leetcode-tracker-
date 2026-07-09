// Last updated: 7/9/2026, 9:20:31 AM
class Solution {
    public int firstUniqChar(String s) {
        int [] a= new int[26];
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(a[s.charAt(i)-'a']==1){
            return i;
        }
        }
        return -1;
    }
}