class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        
        for (int[] querie : queries) {
            for (int i = 0; i < arr.length; i++) {
                if (i == querie[0]) {
                    int temp = arr[querie[0]];
                    arr[querie[0]] = arr[querie[1]];
                    arr[querie[1]] = temp;
                }
                
                answer[i] = arr[i];
            }
        }
        
        return answer;
    }
}