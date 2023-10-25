class Solution {
    public String solution(String my_string) {
        
        String[] strarr = {"a", "e", "i", "o", "u"};
        
        for(String str : strarr) {
            my_string = my_string.replace(str,"");
        }
               
        return my_string;
    }
}