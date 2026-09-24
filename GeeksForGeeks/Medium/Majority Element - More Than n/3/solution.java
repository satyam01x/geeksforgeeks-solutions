class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap <Integer , Integer> map = new HashMap<>();
        
        int min = (arr.length /3);
        int count = 0;
        
        for(int i = 0; i < arr.length; i++){
            
            map.put(arr[i] , map.getOrDefault(arr[i] , 0) + 1);
            
        }
        
        for(int key:map.keySet()){
            if(map.get(key) > min ){
               ans.add(key);
            }
        }
           Collections.sort(ans);
            return ans;
    
        
    }
}