import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (list.isEmpty()) {
                list.add(arr[i]);
            } else if (list.get(list.size() - 1) == arr[i]) {
                list.remove(list.size() - 1); // 마지막원소 제거
            } else if (list.get(list.size() - 1) != arr[i]) {
                list.add(arr[i]);
            }
        }
        
        if (list.size() == 0) {
            list.add(-1);
        }
        
        int[] answer = new int[list.size()];
            
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}