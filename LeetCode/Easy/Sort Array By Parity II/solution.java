class Solution {

    public int[] sortArrayByParityII(int[] nums) {

        int even_idx = 0;
        int odd_idx = 1;

        while( even_idx != nums.length && odd_idx != nums.length){

            if(nums[even_idx] % 2 == 0){
                even_idx += 2;
            }else if(nums[odd_idx] % 2 != 0){
                odd_idx += 2;
            }

            else{
                int temp = nums[even_idx];
                nums[even_idx] = nums[odd_idx];
                nums[odd_idx] = temp;

                even_idx += 2;
                odd_idx += 2;
            }
        }

        return nums;

    }
}