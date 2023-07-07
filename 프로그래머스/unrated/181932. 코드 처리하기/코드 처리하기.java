class Solution {
    public String solution(String code) {
        int mode = 0;
        StringBuffer ret = new StringBuffer();
        
        for(int i=0; i<code.length(); i++) {
            String str = code.substring(i, i+1);
            
            if(mode == 0) {
                if(!str.equals("1")) {
                    if(i%2==0) {
                        ret.append(str);
                    }
                } else {
                    mode = 1;
                }
            } else {
                if(!str.equals("1")) {
                    if(i%2!=0) {
                        ret.append(str);
                    }
                } else {
                    mode = 0;
                }
            }
        }
        
        if(ret.length() == 0) {
           return "EMPTY";
        }
      
        return ret.toString();
    }
}