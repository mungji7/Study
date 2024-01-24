import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> indexList = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                indexList.add(i);
            }
        }
        
        if (indexList.size() == 0) {
            list.add(-1);
        } else {
            for (int i = indexList.get(0); i <= indexList.get(indexList.size() - 1); i++) {
                list.add(arr[i]);
            }
        }
        
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}