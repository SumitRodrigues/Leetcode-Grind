
import java.util.Arrays;
import java.util.HashMap;

// Using Sorting
public class Solution{
    public boolean isAnagram(String s, String t){
        if(s.length() == t.length()){
            return false;
        }

        char[] sSort = s.toCharArray();
        char[] tSort = t.toCharArray();
        Arrays.sort(sSort);
        Arrays.sort(tSort);
        return Arrays.equals(sSort, tSort); 
    }
}

// Time & Space Complexity
// Time complexity: 

// O(nlogn)
// Space complexity: 

// O(1) or  O(n) depending on the sorting algorithm.

// using hash table

public class Solution2{
    public boolean isAnagram(String s, String t){
        if(s.length() == t.length()){
            return false;
        }
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
        }
        return sMap.equals(tMap);
    }
}

// Time & Space Complexity
// Time complexity: 

// O(n)
// Space complexity: 

// O(1)

//Using Hash Table

public class Solution3 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }
}

// Time & Space Complexity
// Time complexity: 

// O(n)
// Space complexity: 

// O(1)