class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        int ans = 0;
        while(start < end){
            int mid = start +(end-start)/2;
            if(arr[mid] > arr[ans]){
                ans = mid;
            }
            if(arr[mid]<arr[mid + 1]){
                start = mid +1;
            }
            else{
                end = mid;
            }
        }
        return ans;

    // i could have also returned the start/end element directly after the loop as in the end,
    // they both point to the largest element.
    }
}