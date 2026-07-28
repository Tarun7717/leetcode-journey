class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] merged = new int[m+n];

        int k=0;
        for(int i=0;i<m;i++){
            merged[k++]=nums1[i];
        }

        for(int j=0;j<n;j++){
            merged[k++]=nums2[j];
        }

        Arrays.sort(merged);

        int len = merged.length;
        if(len%2==1){
            return (double)merged[len/2];
        }

        int mid1 = merged[len/2-1];
        int mid2= merged[len/2];

        return ((double)mid1+(double)mid2)/2.0;
    }
}