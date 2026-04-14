class Solution {
    public int trap(int[] height) {
        
        int n=height.length;
        int leftMax=0;
        int rightMax=0;
        int total=0;
        int l=0;
        int r=n-1;
      while(l<r){
        if(height[l]<=height[r]){
            if(height[l]<leftMax){
                total+=leftMax-height[l];
            }else{
                leftMax=height[l];
            }
            l++;
        }
        else{
            if(height[r]<rightMax){
                total+=rightMax-height[r];
            }else{
                rightMax=height[r];
            }
            r--;
        }
      }
        return total;

    }
}
