class Solution {
    public int solution(int a, int b) {
        String s = String.valueOf(a);
        String s2 = String.valueOf(b);      
        String str = s+s2;
        String str2 = s2+s;
        
        int i = Integer.parseInt(str);
        int j = Integer.parseInt(str2);
        
        if(i < j) {
            return j;
        } else {
            return i;
        }
    }
}