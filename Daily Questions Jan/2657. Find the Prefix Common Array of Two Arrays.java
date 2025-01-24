import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int count = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        int[] res = new int[n];
        for(int i = 0; i < n; i++){
            int temp1 = A[i], temp2 = B[i];
            mp.put(temp1, mp.getOrDefault(temp1, 0)+1);
            if(mp.get(temp1) == 2) count++;
            mp.put(temp2, mp.getOrDefault(temp2, 0)+1);
            if(mp.get(temp2) == 2) count++;
            res[i] = count;
        }
        return res;
    }
}