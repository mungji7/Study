class Solution {
    public int[] solution(int[] arr, int k) {

        for(int i = 0; i<arr.length; i++) {
            int num = 0;
            
            if (k % 2 == 1) {
                num = arr[i] * k;
            } else {
                num = arr[i] + k;
            }
            
            arr[i] = num;
        }
        
        return arr;
    }
}