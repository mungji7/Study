class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        
        for (int[] query : queries) {
            for (int i = 0; i < arr.length; i++) {
                if (i >= query[0] && i <= query[1]) {
                    arr[i] = arr[i] + 1;
                }
                
                answer[i] = arr[i];
            }
        }
        
        return answer;
    }
}