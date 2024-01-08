class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = num_list.length;
        int[] answer = new int[len % n == 0 ? len / n : len / n + 1];
        
        for (int i = 0; i < len; i += n) {
            answer[i/n] += num_list[i];
        }
        
        return answer;
    }
}