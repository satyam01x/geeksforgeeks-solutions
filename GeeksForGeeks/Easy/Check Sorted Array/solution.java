class Solution {
    public boolean isSorted(int[] arr) {
        // code here
        // int current = arr[0];
        int prev = 0;
        
        for(int i = 1; i < arr.length - 1; i++){
            
            if(arr[prev] > arr[i]){
                return false;
            }
            prev = prev + 1;
        }
        
        return true;
        
    }
}