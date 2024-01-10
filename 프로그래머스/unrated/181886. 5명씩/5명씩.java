import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        ArrayList<String> str = new ArrayList<>();
        
        for (int i = 0; i < names.length; i += 5) {
            str.add(names[i]);
        }
                                     
        String[] answer = str.toArray(new String[0]);

        return answer;
    }
}