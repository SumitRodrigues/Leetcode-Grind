// Using queue (BFS approach) to generate "happy strings"

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public String getHappyString(int n, int k) {
        Queue<String> q = new LinkedList<>();
            q.add("a");
            q.add("b");
            q.add("c");
        List<String> res = new ArrayList<>();
        while(!q.isEmpty()){
            String s = q.poll();
            if(s.length() == n){
                res.add(s);
                continue;
            }
            for(char ch : new char[]{'a', 'b', 'c'}){
                if(s.charAt(res.size() - 1) != ch){
                    q.add(s + ch);
                }
            }
        }
        return res.size() < k ? "" : res.get(k - 1);
    }
}