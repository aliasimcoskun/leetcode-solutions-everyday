class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // size of nums1 is m+n but it has m elements. (other n elements are 0 and should be ignored.)
        // nums2 has n elements.
        // store them into nums1 as sorted.

        if(n==0){
            return;
        }
        int[] newArr = new int[m+n];
        int j=0; // pointer for nums1
        int k=0; // pointer for nums2
        for(int i=0;i<m+n;i++){
            System.out.print("i: " + i + " j: " + j + " k: " + k + "\n");
            if((k == n) || ((nums1[j]<nums2[k] || nums1[j]==nums2[k]) && j<m)){
                newArr[i]=nums1[j];
                j++;
            }
            else if(j==m || nums1[j]>nums2[k]){
                newArr[i]=nums2[k];
                k++;
            }
        }

        for(int i=0;i<m+n;i++){
            nums1[i]=newArr[i];
        }
    }
}