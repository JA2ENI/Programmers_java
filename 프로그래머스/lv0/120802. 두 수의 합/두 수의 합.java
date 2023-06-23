class Solution {
    public int solution(int num1, int num2) {
        int check = -50000;
        int check2 = 50000;
         int answer = 0;
        
        if(check<=num1 && check2>=num1 && check<=num2 && check2>=num2) {
            answer = num1 + num2;
        }
      
        return answer;
    }
}