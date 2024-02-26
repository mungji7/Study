import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        
        String[] strArr = my_string.split("");
        
        for (int index : indices) {
            strArr[index] = "";
        }
        
        answer = String.join("", strArr);
        
        return answer;
    }
}