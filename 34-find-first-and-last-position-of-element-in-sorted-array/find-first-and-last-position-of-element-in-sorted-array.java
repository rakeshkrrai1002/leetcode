class Solution {
    public int[] searchRange(int[] nums, int target) {
        // run the binary search twice, one for lowest occurance and once for the highest occurance

        //lowest occurance 
        int start = 0;
        int end = nums.length - 1;

        int lowest = -1;
        int highest = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                end = mid-1;
                lowest = mid;

            }else if(target < nums[mid]){
                end = mid -1;
            }
             else {
                start = mid + 1;
            }
        }

        start = 0;
        end = nums.length - 1;

        // highest
         while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                start = mid+1;
                highest = mid;

            }else if(target < nums[mid]){
                end = mid -1;
            }
             else {
                start = mid + 1;
            }
        }
        return new int[] { lowest, highest };

    }
}