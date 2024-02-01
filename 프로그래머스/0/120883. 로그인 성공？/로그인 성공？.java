class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        
        for (String[] user : db) {
            if (id_pw[0].equals(user[0]) && id_pw[1].equals(user[1])) {
                answer = "login";
                break;
            } else if (id_pw[0].equals(user[0])) {
                answer = "wrong pw";
                break;
            }
                
        }
        
        return answer;
    }
}