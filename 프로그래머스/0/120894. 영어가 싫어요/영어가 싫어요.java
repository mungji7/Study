class Solution {
    public long solution(String numbers) {
        long answer = 0;
        
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        
        for (int i = 0; i < arr.length; i++) {
            numbers = numbers.replace(arr[i], num[i]);
        }
        
        answer = Long.parseLong(numbers);
        
        return answer;
    }
}