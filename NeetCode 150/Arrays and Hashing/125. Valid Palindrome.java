// Using two pointers

class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        int left = 0, right = s.length() - 1;
        while(left <= right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

// Time & Space Complexity
// Time complexity: 

// O(n)
// Space complexity: 

// O(1)

// by reverding the string

class Solution2 {
    public boolean isPalindrome(String s) {
        StringBuilder newStr = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                newStr.append(Character.toLowerCase(c));
            }
        }
        return newStr.toString().equals(newStr.reverse().toString());
    }
}

// Time & Space Complexity
// Time complexity: 

// O(n)
// Space complexity: 

// O(n)