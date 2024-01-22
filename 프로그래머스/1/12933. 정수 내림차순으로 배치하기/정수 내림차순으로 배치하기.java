import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = "";
        
        String[] strArr = String.valueOf(n).split("");
        
        Arrays.sort(strArr, Collections.reverseOrder());
        
        for (String s : strArr) {
            str += s;
        }
        
        answer = Long.parseLong(str);
        
        return answer;
    }
}