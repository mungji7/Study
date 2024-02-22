class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int x = board[0] / 2;
        int y = board[1] / 2;
        
        for (String s : keyinput) {
            if (s.equals("up") && answer[1] < y) {
                answer[1] += 1;
            } else if (s.equals("down") && answer[1] > (-y)) {
                answer[1] -= 1;
            } else if (s.equals("left") && answer[0] > (-x)) {
                answer[0] -= 1;
            } else if (s.equals("right") && answer[0] < x) {
                answer[0] += 1;
            }
        }
        
        return answer;
    }
}