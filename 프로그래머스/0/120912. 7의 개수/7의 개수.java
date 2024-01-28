class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for (int num : array) {
            String[] strArr = String.valueOf(num).split("");
            
            for (String str : strArr) {
                if (str.equals("7")) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}