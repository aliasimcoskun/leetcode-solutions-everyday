// time complexity: O(n)
// space complexity: O(n)
class Solution {
    // two-pass scan
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] answer = new int[n];
        int prev = -n;                // position of last seen c (far left initially)

        // left to right pass: distance to previous c
        for (int i=0; i<n; i++) {
            if (s.charAt(i) == c) {
                prev = i;             // update last seen c
            }
            answer[i] = i - prev;        // distance from i to last c on left
        }

        prev = 2*n;                 // position of next c (far right initially)
        // right to left pass: take min with next c on right
        for (int i=n-1; i>=0; i--) {
            if (s.charAt(i) == c) {
                prev = i;             // update next seen c
            }
            answer[i] = Math.min(answer[i], prev - i);
        }

        return answer;
    }
}
