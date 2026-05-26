class Solution {
    public int largestElement(int[] nums) {
    int count=0;
    for(int num:nums){
        count=Math.max(count,num);
    }
    return count;
    }
}
