class Solution {
    ArrayList<Integer> findMissing(int[] a, int[] b) {
        
        // code here
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> res = new ArrayList<>();
        
        for (int num : b) {
            set.add(num);
        }

        for (int num : a) {
            if (!set.contains(num)) {
                res.add(num);
            }
        }
        
        return res;
    }
}