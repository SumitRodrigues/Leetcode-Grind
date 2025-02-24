class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if(s == null || n < 1) return "";
        int start = 0, end = 0;

        for(int i = 0; i < n; i++){
            int len1 = expandFromMiddle(s, i, i);
            int len2 = expandFromMiddle(s, i, i+1);
            int len = Math.max(len1, len2);
            if(len > end - start){
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(end, start + 1);
    }
    public int expandFromMiddle(String s, int left, int right){
        if(s == null || left > right) return 0;
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right - left - 1;
    }
}