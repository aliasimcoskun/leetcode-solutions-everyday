//O(N^2) solution
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> result;
        for (int i=0;i<nums.size()-1;i++){
            for (int j=i+1;j<nums.size();j++){
                if(nums[i]+nums[j]==target){ 
                    result = {i,j};
                    break;
                }
            }
        }
        return result;
    }
};