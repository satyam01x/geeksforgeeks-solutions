class Solution {
    public int recursiveSum(int n) {
        // code here
        if( n == 0){
            return 0;
        }
        
        int sum = 0;
        return sum = n + recursiveSum( n - 1 ) ;
    }
}