class Solution {
    public String solution(String my_string, String alp) {
        
        String[] strArr = my_string.split("");
        
        for(String str : strArr) {
            if(str.equals(alp)) {
                my_string = my_string.replace(alp, alp.toUpperCase());
            }
        }
        
        return my_string;
    }
}