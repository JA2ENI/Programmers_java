import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int check = n%2==0 ? 0 : 1;
        ArrayList<Integer> addNum = new ArrayList<Integer>();
        ArrayList<Integer> evenNum = new ArrayList<Integer>();
        
        for(int i=1; i<=n; i++) {
            if(i%2==0) {
                addNum.add(i);      
            } else {
                evenNum.add(i); 
            }
        }
        
        if(check == 0) {
            for(int i=0; i<addNum.size(); i++) {
                answer += addNum.get(i) * addNum.get(i);
            } 
        } else {
            for(int j=0; j<evenNum.size(); j++) {
                answer += evenNum.get(j);
            }
        }

        return answer;
    }
}