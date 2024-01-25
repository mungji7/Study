class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        
        for (int[] querie : queries) {
            for (int i = 0; i < arr.length; i++) {
                if ((i >= querie[0] && i <= querie[1]) && i % querie[2] == 0) {
                    arr[i] += 1;
                }
                answer[i] = arr[i];
            }
        }
        
        return answer;
    }
}