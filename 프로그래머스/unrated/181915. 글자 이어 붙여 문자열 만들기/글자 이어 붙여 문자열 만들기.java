class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        
        String[] my_Arr = my_string.split("");
        
        for (int i = 0; i < index_list.length; i++) {
            answer += my_Arr[index_list[i]];
        }
        
        return answer;
    }
}