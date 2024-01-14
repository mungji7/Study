import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        
        ArrayList<String> list = new ArrayList<>();
        
        for (String str : answer) {
            if (!str.isEmpty()) {
                list.add(str);
            }
        }
        
        answer = list.toArray(new String[0]);
    
        Arrays.sort(answer);
        
        return answer;
    }
}