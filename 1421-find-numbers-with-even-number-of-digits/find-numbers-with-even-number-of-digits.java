class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for(int i=0; i<=nums.length-1; i++)
        {
            int count = 0;
            int n = nums[i];
            while(n>0){
                n=n/10;
                count++;
            }
            if (count%2 == 0){
                ans +=1;
            }
        }
        return ans;
    }
}