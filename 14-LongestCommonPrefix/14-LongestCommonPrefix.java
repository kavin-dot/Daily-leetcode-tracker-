// Last updated: 7/9/2026, 9:21:02 AM
class Solution {
    public String longestCommonPrefix(String[] str) {
        Arrays.sort(str);
        String first=str[0];
        String last=str[str.length-1];
        int minlength=Math.min(first.length(), last.length());
        int i=0;
        while(i<minlength&&first.charAt(i)==last.charAt(i)){
            i++;
        }
        return first.substring(0,i);
    }
}