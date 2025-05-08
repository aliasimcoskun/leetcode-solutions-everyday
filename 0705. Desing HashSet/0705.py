# time complexity: O(1)
# space complexity: O(U) where U = 10^6+1
class MyHashSet(object):

    def __init__(self):
        # support keys in [0,10^6]
        self.present = [False] * 1000001

    def add(self, key):
        """
        :type key: int
        :rtype: None
        """
        # mark as present
        self.present[key] = True

    def remove(self, key):
        """
        :type key: int
        :rtype: None
        """
        # mark as absent
        self.present[key] = False

    def contains(self, key):
        """
        :type key: int
        :rtype: bool
        """
        # return presence
        return self.present[key]


# Your MyHashSet object will be instantiated and called as such:
# obj = MyHashSet()
# obj.add(key)
# obj.remove(key)
# param_3 = obj.contains(key)