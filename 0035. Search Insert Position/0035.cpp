//the easiest way to solve
class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        int right=nums.size()-1;
        int left=0;

        int middle;
        while(left<=right){
            middle=(left+right)/2;
            if (nums[middle]<target){
                left=middle + 1;
            }
            else if (nums[middle]>target)
                right=middle - 1;
            else{
                return middle;
            }
        }

        return left; // that is...
    }
};