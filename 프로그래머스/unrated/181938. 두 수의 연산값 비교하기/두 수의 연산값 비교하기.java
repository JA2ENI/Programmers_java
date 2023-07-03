class Solution {
    public int solution(int a, int b) {
        String s = String.valueOf(a);
        String s2 = String.valueOf(b);
        
        String str = s+s2;
        int i = Integer.parseInt(str); 
        int j = 2*a*b; 
        
        if(j > i) {
            return j;    
        } else {
            return i;
        }
    }
}