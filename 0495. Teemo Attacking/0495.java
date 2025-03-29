// time complexity: O(n*duration)
// space complexity: O(1)
class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        // timeSeries array is non-decreasing -> for ex: [1,1,1,2,5,6]

        int total = 0;
        for(int i = 0; i < timeSeries.length; i++) {
            // skip duplicate attack times
            if( i < timeSeries.length - 1 && ,
            timeSeries[i] == timeSeries[i + 1])
            continue;

            // simulate poison effect for each second
            for(int j = 0; j < duration; j++) {
                total++;
                // if the next attack happens before poison ends, stop early
                if( i < timeSeries.length - 1 &&
                        timeSeries[i] + j + 1 == timeSeries[i + 1])
                    break;
            }
        }
        return total;
    }
}