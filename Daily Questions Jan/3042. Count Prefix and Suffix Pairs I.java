class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        // Get the total number of words in the array
        int n = words.length;
        // Initialize a counter to keep track of valid prefix-suffix pairs
        int count = 0;

        // Iterate through each pair of words in the array
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                // Extract the current pair of words
                String s1 = words[i];
                String s2 = words[j];

                // Check if the second word starts and ends with the first word
                if (s2.startsWith(s1) && s2.endsWith(s1)) {
                    // Increment the count if the condition is met
                    count++;
                }
            }
        }

        // Return the total count of valid prefix-suffix pairs
        return count;
    }
}