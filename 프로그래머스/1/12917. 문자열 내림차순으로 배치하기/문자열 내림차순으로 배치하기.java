import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] sArr = s.split("");
        
        Arrays.sort(sArr, Collections.reverseOrder());
        
        for (String str : sArr) {
            answer += str;
        }
        
        return answer;
    }
}