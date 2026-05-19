class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        
        int min = Integer.MAX_VALUE;
        Set<Integer> set = new HashSet<>();

        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }

        for(int j=0;j<nums2.length;j++){
            if(set.contains(nums2[j])){
                min = Math.min(min,nums2[j]);
            }
        }

        if(min==Integer.MAX_VALUE){
            return -1;
        }
        return min;
    }
}
