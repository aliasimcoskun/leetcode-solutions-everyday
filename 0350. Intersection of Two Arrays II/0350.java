// time complexity: O(n*m)
// space complexity: O(n+m)
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // convert nums1 to an ArrayList for easy removal operations
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            arr1.add(nums1[i]);
        }

        // create an ArrayList to store the intersection result
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (arr1.contains(nums2[i])) { // check if nums2[i] exists in arr1
                arr2.add(nums2[i]); // intersection
                // handle duplicates
                arr1.remove(arr1.indexOf(nums2[i])); 
            }
        }

        // convert ArrayList to an array and return
        int[] array = arr2.stream().mapToInt(i -> i).toArray();
        return array;
    }
}
