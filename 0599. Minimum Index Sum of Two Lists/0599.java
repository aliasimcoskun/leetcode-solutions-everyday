/*
 * Time Complexity: O(n + m)
 * - O(n) for iterating list1 and building the first map.
 * - O(m) for iterating list2 and processing common elements.
 *
 * Space Complexity: O(n)
 * - O(n) for storing elements in the map, where n is the number of elements in list1.
 */
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        // create a map to store each restaurant from list1 with its index
        Map<String, Integer> map = new HashMap<>();
        // create a map to store common restaurants with the sum of indices
        Map<String, Integer> map2 = new HashMap<>();

        // populate map with restaurants from list1 and their indices
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        // iterate over list2 and if a restaurant is common, add the index sum to map2
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                map2.put(list2[i], map.get(list2[i]) + i);
            }
        }

        // initialize minimum_value with the maximum possible index sum
        Integer minimum_value = list1.length + list2.length;
        // find the smallest index sum among the common restaurants
        for (Integer i : map2.values()) {
            minimum_value = Math.min(i, minimum_value);
        }

        // collect all restaurants with the minimum index sum
        List<String> list = new ArrayList<String>();
        for (String i : map2.keySet()) {
            // I got an error because I used "==" instead of "equals()" in this line.
            if (map2.get(i).equals(minimum_value)) {
                list.add(i);
            }
        }

        // convert the result list to an array
        return list.toArray(new String[0]);
    }
}
