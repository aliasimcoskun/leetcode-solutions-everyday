// time complexity: O(n)
// space complexity: O(1)
class Solution {
    // greedy one-pass scan from left to right
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0, n = bits.length;
        // iterate until the last index
        while (i < n - 1) {
            if (bits[i] == 1) {
                i += 2;  // two-bit character (10 or 11)
            } else {
                i += 1;  // one-bit character (0)
            }
        }
        // if we land exactly on the last bit, it must be the one-bit char
        return i == n - 1;
    }
}