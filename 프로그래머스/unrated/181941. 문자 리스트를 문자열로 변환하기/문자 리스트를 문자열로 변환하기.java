class Solution {
    public String solution(String[] arr) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        
        for(String i : arr) {
            sb.append(i);
        }
        answer = sb.toString();
        
        return answer;
    }
}