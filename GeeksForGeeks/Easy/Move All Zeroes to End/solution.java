class Solution {
    void pushZerosToEnd(int[] arr) {

        int i = 0;
        int j = 0;

        while(i < arr.length) {

            if(arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }

            i++;
        }

        while(j < arr.length) {
            arr[j] = 0;
            j++;
        }
    }
}