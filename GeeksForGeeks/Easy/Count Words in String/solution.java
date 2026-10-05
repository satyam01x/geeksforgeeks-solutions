class Solution {
    public int countWords(String s) {
        // code here
        // first check for the one next step ahead of \n , \t , ' '
        
        int count = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '\t' &&
                s.charAt(i) != ' ' &&
                s.charAt(i) != '\n'){
                
                // now check for it previous index i - 1
                if( i == 0 ||
                    s.charAt(i - 1) == '\t' ||
                    s.charAt(i - 1) == '\n' ||
                    s.charAt(i - 1) == ' '){
                        
                        count ++;
                    
                }
            }
        }
        
        return count;
    }
}