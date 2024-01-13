import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int minVal = Integer.MAX_VALUE;
        
        for (int i : arr) {
            minVal = Math.min(minVal, i);
            list.add(i);
        }
        
        list.remove(Integer.valueOf(minVal));
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        if (answer.length == 0) {
            return new int[]{-1};
        }
        
        return answer;
    }
}