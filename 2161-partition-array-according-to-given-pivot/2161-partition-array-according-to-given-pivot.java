class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> smaller= new ArrayList<>();
        List<Integer> equal= new ArrayList<>();
        List<Integer> greater= new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]>pivot){
                greater.add(nums[i]);
            }else if(nums[i]==pivot){
                equal.add(nums[i]);
            }else{
                smaller.add(nums[i]);
            }
        }
        int idx=0;

        for(int n : smaller){
            nums[idx++]=n;
        }

        for(int n : equal){
            nums[idx++]=n;
        }
        for(int n : greater){
            nums[idx++]=n;
        }
        return nums;
    }
}