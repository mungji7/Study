import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String str = my_string.toLowerCase();
        
        char[] chArr = str.toCharArray();
        
        Arrays.sort(chArr);
        
        for (char ch : chArr) {
            answer += ch;
        }
        
        return answer;
    }
}