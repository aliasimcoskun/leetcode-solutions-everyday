class Solution {
    public List<String> summaryRanges(int[] nums) {
        // each number is unique
        List<String> ranges = new ArrayList<>();
        List<Integer> consecutive = new ArrayList<>();

        // return empty list if the array is empty
        if (nums == null || nums.length == 0) {
            return ranges;
        }

        for(int i=1; i<nums.length; i++){
            if(nums[i-1]+1 == nums[i]){
                consecutive.add(nums[i-1]);
            }
            else{
                if(consecutive.isEmpty()){
                    // we convert integer to string.
                    ranges.add(String.valueOf(nums[i - 1]));
                }
                else{
                    // we concatenate the first element 
                    // and the last element of the consecutive list with "->".
                    ranges.add(
                        String.valueOf(consecutive.get(0)) 
                        + "->" + 
                        String.valueOf(nums[i - 1])
                    );
                    consecutive.clear();
                }
            }
        }

        // adding remaining elements at the end of the loop
        if(!consecutive.isEmpty()){
            ranges.add(
                String.valueOf(consecutive.get(0)) 
                + "->" + 
                String.valueOf(nums[nums.length - 1])
            );
        } 
        else{
            ranges.add(String.valueOf(nums[nums.length - 1]));
        }
        return ranges;
    }
}