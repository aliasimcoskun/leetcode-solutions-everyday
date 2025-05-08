// time complexity: O(1)
// space complexity: O(U) where U = 10^6+1 (size of universe)
class MyHashSet {
    private boolean[] present;            // array to record if key is present

    /** Initialize your data structure here. */
    public MyHashSet() {
        present = new boolean[1_000_001]; // support keys in [0,10^6]
    }

    /** Inserts the value key into the HashSet. */
    public void add(int key) {
        present[key] = true;              // mark as present
    }

    /** Removes the value key in the HashSet. */
    public void remove(int key) {
        present[key] = false;             // mark as absent
    }

    /** Returns true if this set contains the specified element. */
    public boolean contains(int key) {
        return present[key];              // check presence
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */