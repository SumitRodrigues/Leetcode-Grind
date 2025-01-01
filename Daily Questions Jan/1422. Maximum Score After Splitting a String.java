

class Solution {
    public int maxScore(String s){
        int n = s.length();
        int totalOnes = 0;
        int leftZeros = 0;
        int currentScore = 0;
        int maxScore = Integer.MIN_VALUE;

        for(char ch : s.toCharArray()){
            if(ch == '1') totalOnes++;
        }

        for(int i = 0; i < n-1; i++){
            if(s.charAt(i) == '0') leftZeros++;
            else totalOnes--;

            currentScore = leftZeros + totalOnes;
            maxScore = Math.max(maxScore, currentScore);
        }
        return maxScore;
    }
} 