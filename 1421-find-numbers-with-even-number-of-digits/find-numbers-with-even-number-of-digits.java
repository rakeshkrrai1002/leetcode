class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for(int i =0; i<nums.length; i++)
        {
            int count = 0;
            while(nums[i] > 0){
                nums[i] = nums[i] /10;
                count += 1;
            }
            if(count % 2 == 0) {
                ans +=1;
            }
        }
        return ans;
        
    }
}