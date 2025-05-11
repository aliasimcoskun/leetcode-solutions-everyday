// time complexity: O(n) where n = s.length()
// space complexity: O(1)
class Solution {
    // greedy scan with an imperative loop
    public int[] numberOfLines(int[] widths, String s) {
        int lines = 1;          // start on the first line
        int curWidth = 0;       // current line width
        for (char c : s.toCharArray()) {
            int w = widths[c - 'a'];           // width of this character
            if (curWidth + w > 100) {          // would overflow current line?
                lines++;                       // move to next line
                curWidth = w;                  // this char starts the new line
            } else {
                curWidth += w;                 // otherwise append to current line
            }
        }
        return new int[] { lines, curWidth };  // [total lines, last line width]
    }
}