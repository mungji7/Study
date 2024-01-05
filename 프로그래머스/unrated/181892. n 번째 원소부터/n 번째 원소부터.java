class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length - n + 1];
        
        for (int i = n; i-n < answer.length; i++) {
            answer[i-n] = num_list[i-1];
        }
            
        return answer;
    }
}