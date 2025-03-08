// time complexity: O(n)
// space complexity: O(1)
class Solution {
    public int maxArea(int[] height) {
        // height contains at least 2 elements.
        int max_area = 0, current_max = 0;
        int i = 0, j = height.length-1;
        while(i!=j){
            // find the current max
            current_max = Math.min(height[j], height[i]) * (j-i);
            // and compare if it's greater than max area
            max_area = Math.max(max_area, current_max);

            // move the pointer to the shorter height
            if (height[i] > height[j])
                j--;
            else i++;
        }

        return max_area;
    }
}