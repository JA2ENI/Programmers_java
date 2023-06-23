class Solution {
    public int solution(int num1, int num2) {
        int check = 0;
        int check2 = 10000;
        int answer = 0;
        
        if(check<=num1 && check2>=num1 && check<=num2 && check2>=num2) {
            if(num1 == num2) {
                answer = 1;
            } else {
                answer = -1;
            }
        }
        
        return answer;
    }
}