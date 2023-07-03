class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        int j = 1; 
        
        for(int i=0; i<str1.length(); i++) { 
            sb.append(str1.substring(i,j));
            sb.append(str2.substring(i,j));
            j++;
        }       
        answer=sb.toString();
        
        return answer;
    }
}