import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        String[] strArr = my_string.split("");
        String tmp = "";
        
        for(int i=0;i<strArr.length/2;i++) {
            tmp = strArr[i];
            strArr[i] = strArr[strArr.length-1-i];
            strArr[strArr.length-1-i] = tmp;
        }
        
        answer = String.join("", strArr);
        
        return answer;
    }
}