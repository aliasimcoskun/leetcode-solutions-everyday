// time complexity: O(n)
// space complexity: O(1)
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // if no flower is needed, return true immediately.
        if(n == 0) return true;

        for(int i=0; i<flowerbed.length; i++){
            if(flowerbed[i] == 0){ // check if the current plot is empty
                // if the previous plot exists and has a flower: skip
                if(i-1 >= 0 && flowerbed[i-1] == 1) continue;
                // if the next plot exists and has a flower: skip
                if(i+1 < flowerbed.length && flowerbed[i+1] == 1) continue;
                n--;
                i++;
            }
            // if we have planted all required flowers, return true
            if(n == 0) return true;
        }

        // if not all required flowers were planted, return false
        return false;
    }
}