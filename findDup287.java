class Solution {
    public int findDuplicate(int[] nums) {
        int i =0;
        while(i < nums.length){
            int c = nums[i]-1;
            if(nums[i]!= nums[c])
            swap(nums,i,c);
            else
            i++;
        }
        for(int j =0 ;j<nums.length;j++){
            if(nums[j]!=j+1)return nums[j];
        }
        return -1;
        
    }
    public void swap(int[] nums,int i, int j){
        int temp = nums[i];
        nums [i]= nums [j];
        nums[j]=temp;
    }
}
