void merge(int* nums1, int nums1Size, int m, int* nums2, int nums2Size, int n) {
    // we're gonna try from the end to the beginning
    // nums1Size = m+n
    // nums2Size = n
    
    if(n==0) return;
    if(m==0) for(int i=0; i<n; i++) nums1[i]=nums2[i];
    m--;
    n--;
    while (m>=0 && n>=0){
        if(nums1[m]<nums2[n] || nums1[m]==nums2[n]) nums1[--nums1Size]=nums2[n--];
        else if(nums1[m]>nums2[n]) nums1[--nums1Size]=nums1[m--];
    }

    // if there remaining elements
    while(n>=0) nums1[--nums1Size]=nums2[n--];
}