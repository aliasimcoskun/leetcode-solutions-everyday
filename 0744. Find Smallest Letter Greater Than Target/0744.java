// time complexity: O(n)
// space complexity: O(1)
class Solution {
    // linear scan
    public char nextGreatestLetter(char[] letters, char target) {
        // letters is sorted in non-decreasing order
        for(int i=0; i<letters.length; i++){
            // return first character greater than target
            if(letters[i] > target){
                return letters[i];
            }
        }
        // if none found, return the first element
        return letters[0];
    }
}