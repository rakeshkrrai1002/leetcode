class Solution {
    public char nextGreatestLetter(char[] letters, char target) {

        if (letters[letters.length - 1] <= target) {
            return letters[0];
        }
        // else if(letters[0] > target){
        //     return letters[0];
        // }

        int start = 0;
        int end = letters.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (letters[mid] > target) {    
                end = mid;
            }
             else {
                start = mid + 1;
            }
        }
        return letters[end];
    }
}