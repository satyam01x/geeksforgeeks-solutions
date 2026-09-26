class Solution {
    public int majorityElement(int[] nums) {

        HashMap < Integer , Integer> map = new HashMap<>();

        int majority = nums.length/2;

        for(int n : nums){
        map.put(n , map.getOrDefault(n , 0) + 1);
        }

        for( int key : map.keySet()){
            if(map.get(key) > majority){
            return key;
            
        }
        }

        return -1;

    }
}