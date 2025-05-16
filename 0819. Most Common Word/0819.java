// time complexity: O(N + B)
// space complexity: O(N + B)
// where N = length of paragraph (for split + scan) and B = total length of banned list.
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        // build a set of banned words for O(1) lookup
        Set<String> banSet = new HashSet<>(Arrays.asList(banned));
        // normalize to lowercase and split on non-letters
        String[] words = paragraph.toLowerCase().split("[^a-z]+");
        Map<String, Integer> count = new HashMap<>();
        String result = "";
        int maxFreq = 0;
        // count occurrences
        for (String w : words) {
            if (w.isEmpty() || banSet.contains(w)) continue;
            int freq = count.getOrDefault(w, 0) + 1;
            count.put(w, freq);
            // track the word with highest frequency
            if (freq > maxFreq) {
                maxFreq = freq;
                result = w;
            }
        }
        return result;
    }
}