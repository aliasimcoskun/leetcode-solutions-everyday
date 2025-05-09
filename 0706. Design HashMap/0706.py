# time complexity: O(1)
# space complexity: O(U), where U = 10^6 + 1 (size of the direct-address table)
class MyHashMap(object):

    def __init__(self):
        # set universe size and initialize all slots to -1 (empty)
        self.size = 10**6 + 1
        self.data = [-1] * self.size

    def put(self, key, value):
        """
        :type key: int
        :type value: int
        :rtype: None
        """
        # store value directly at index = key
        self.data[key] = value

    def get(self, key):
        """
        :type key: int
        :rtype: int
        """
        # return value or -1 if not present
        return self.data[key]

    def remove(self, key):
        """
        :type key: int
        :rtype: None
        """
        # reset to -1 to “remove” mapping
        self.data[key] = -1

# Your MyHashMap object will be instantiated and called as such:
# obj = MyHashMap()
# obj.put(key,value)
# param_2 = obj.get(key)
# obj.remove(key)