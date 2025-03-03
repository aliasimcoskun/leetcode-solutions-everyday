// time complexity: O(N + M)
// space compleixty: O(N + M) in the worst case scenario
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // Create a HashSet to store unique elements from nums1
        HashSet<Integer> intersect = new HashSet<>();
        for(int i = 0; i < nums1.length; i++){
            intersect.add(nums1[i]); // Add each element from nums1 to the set
        }

        // Create a list to store the intersection result
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums2.length; i++){
            if(intersect.contains(nums2[i])){ // Check if nums2[i] exists in the set
                list.add(nums2[i]);
                // Remove to ensure unique values in the intersection
                intersect.remove(nums2[i]); 
            }
        }

        // Convert the list to an integer array and return it
        int[] result = list.stream().mapToInt(i -> i).toArray();
        return result;
    }
}
