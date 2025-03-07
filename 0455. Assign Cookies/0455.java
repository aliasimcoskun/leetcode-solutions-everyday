// time complexity: O(nlogn + mlogm) -> sorting
// space complexity: O(1)
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        // g -> greed factors
        // s -> size of the cookies

        // first, sort the arrays
        Arrays.sort(g);
        Arrays.sort(s);

        int output = 0; // count of content children
        int i = 0; // pointer for children
        int j = 0; // pointer for cookies

        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) { // if cookie satisfies greed
                i++; // move to next child
                output++; // +1 content children count
            }
            j++; // next cookie
        }

        return output;
    }
}