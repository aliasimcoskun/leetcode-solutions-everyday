// time complexity: O(W·M·L) - worst case. where:
//      - W is number of the words
//      - M is length of the each word
//      - L is length of the "characters" variable
// space complexity: O(L)
class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        // get only letters from licensePlate, and convert to lowercase
        StringBuilder characters = new StringBuilder();
        for (char c : licensePlate.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                characters.append(c);
            }
        }

        String ans = null;
        for (String w : words) {
            // skip if there is already a shorter
            if (ans != null && w.length() >= ans.length()) continue;

            // create copy of characters content
            StringBuilder need = new StringBuilder(characters);

            // try to delete one from need for each letter in the word
            for (char c : w.toCharArray()) {
                int index = need.indexOf(String.valueOf(c)); // c is char, so use "valueOf()"
                if (index != -1) { // indexOf() returns -1, if doesn't exist
                    need.deleteCharAt(index);
                }
                if (need.length() == 0) break;  // break, if all of the letters are matched
            }

            // valid answer, if need is empty
            if (need.length() == 0) {
                ans = w;
            }
        }

        return ans;
    }
}
