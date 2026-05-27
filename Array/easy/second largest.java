class Solution {
    public int secondLargestElement(int[] nums) {
        Arrays.sort(nums);
        int second=0;
        int n=nums.length;
        int i=n-1;
        while(i>0 && nums[i]==nums[i-1]){
            i--;
        }
        if(i==0)return-1;
        return nums[i-1];
    }
}
