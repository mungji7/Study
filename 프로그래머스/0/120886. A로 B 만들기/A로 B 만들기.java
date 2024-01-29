import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        String[] B = before.split("");
        String[] A = after.split("");
        
        Arrays.sort(B);
        Arrays.sort(A);
        
        if (Arrays.equals(B, A)) {
            answer = 1;
        }
        
        return answer;
    }
}