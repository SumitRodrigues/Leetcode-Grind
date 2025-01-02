class Solution{
    private boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public int[] vowelStrings(String[] words, int[][] queries){
        int q = queries.length;
        int n = words.length;
        int[] ans = new int[q];
        int[] cumSum = new int[n];

        int sum = 0;
        for(int i = 0; i < n; i++){
            if (isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length() - 1))){
                sum++;
            }
            cumSum[i] = sum;
        }

        for(int i = 0;  i < q; i++){
            int l = queries[i][0];
            int r = queries[i][1];
            ans[i] = cumSum[r] - (l > 0 ? cumSum[l - 1] : 0);
        }
        return ans;
    }
}