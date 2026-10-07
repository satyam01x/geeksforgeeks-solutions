class Solution {
    public static char getMaxOccuringChar(String s) {
        // code here
        int [] arr = new int [26];
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            arr[ch - 'a' ]++;
        }
        
        int max = 0;
        char ans = 'a';
        
        for(int i = 0; i < 26 ; i++){
            if(arr[i] > max){
                max = arr[i];
                // to convert in ascii value 
                ans = (char) (i + 'a') ;
            }
        }
        
        return ans;
    }
}