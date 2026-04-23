class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n=nums1.length;
        Set<Integer> set=new HashSet<>();
        Set<Integer> resSet=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums1[i]);
        }

        for(int j=0;j<nums2.length;j++){
            if(set.contains(nums2[j])){
                resSet.add(nums2[j]);
            }
        }
        int[] res=new int[resSet.size()];
        int i=0;
        for(int num: resSet){
            res[i++]=num;
        }

        return res;
    }
}
