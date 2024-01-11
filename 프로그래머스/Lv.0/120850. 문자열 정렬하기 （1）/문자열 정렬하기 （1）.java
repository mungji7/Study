import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> list = new ArrayList<>();
        
        char[] chArr = my_string.toCharArray();
        
        for (char ch : chArr) {
            if (Character.isDigit(ch)) {
                list.add(Character.getNumericValue(ch));
            }
        }
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}