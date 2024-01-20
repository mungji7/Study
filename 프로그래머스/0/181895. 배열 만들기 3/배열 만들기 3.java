import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int[] numArr : intervals) {
            for (int i = numArr[0]; i <= numArr[1]; i++) {
                answer.add(arr[i]);
            }
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}