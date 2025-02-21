// time complexity O(nlogn)
// space complexity O(1)

class Solution {
    public:
        bool containsDuplicate(vector<int>& nums) {
            // solution with sort
            sort(nums.begin(), nums.end()); // O(nlogn) time complexity
            
            for(int i=1; i<nums.size(); i++){
                if(nums[i-1]==nums[i]) return true;
            }
    
            return false;
        }
    };