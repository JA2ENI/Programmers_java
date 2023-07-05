class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;

		if(ineq.contains(">") && eq.contains("=")) {
			answer = (n >= m) ? 1 : 0;
		} else if(ineq.contains("<") && eq.contains("=")) {
			answer = (n <= m) ? 1 : 0;
		} else if(ineq.contains(">") && eq.contains("!")) {
			answer = (n > m) ? 1 : 0;
		} else if(ineq.contains("<") && eq.contains("!")) {
			answer = (n < m) ? 1 : 0;
		} 
        
        return answer;
    }
}