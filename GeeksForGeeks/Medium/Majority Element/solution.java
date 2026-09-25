class Solution {
    int majorityElement(int arr[]) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int majority = arr.length / 2 ;
        
        for(int num : arr){
            map.put(num , map.getOrDefault(num , 0) + 1);
        }
        
        for(int key : map.keySet()){
            if(map.get(key) > majority){
            return key;
        } 
        }
        
        
        return -1;
        
    }
}