class Solution {
    public ArrayList<Integer> fibonacciNumbers(int n) {
        // code here
        
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(0);

            if (n >= 2) {
                list.add(1);
            }

            for (int i = 2; i < n; i++) {
                list.add(list.get(i - 1) + list.get(i - 2));
            }

            return list;
    }
}