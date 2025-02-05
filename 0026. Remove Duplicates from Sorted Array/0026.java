class Solution {
    public int removeDuplicates(int[] nums) {
        int unique=0;
        int[] unique_array;
        unique_array = new int[210];
        if (nums != null){
            unique_array[unique]=nums[0];
            unique++;
        }
        for(int i=1; i<nums.length; i++){
            if (nums[i]!=nums[i-1]) {
                unique_array[unique]=nums[i];
                unique++;
                System.out.println(unique);
            }
        }
        for(int j=0; j<unique; j++){
            nums[j]=unique_array[j];
        }
        return unique;
    }
}