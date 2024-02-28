import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int minDiff = Integer.MAX_VALUE;
        
        Arrays.sort(array);

        for (int num : array) { 
            int diff = Math.abs(n - num);
            
            if (diff < minDiff) {
                minDiff = diff;
                answer = num;
            }
        }
        
        return answer;
    }
}