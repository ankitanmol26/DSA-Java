//leetcode problem 485. Max Consecutive Ones
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        //maixum ko phele 0 karenge
        int maxi = 0;
        //count ko bhi zero karenge
        int count = 0;
        //phir hamlog array ko itreate karenge
        for(int i=0; i<nums.length; i++){
            //agar element 1 hua tho count ko ++ karenge
            if(nums[i]==1){
                count++;
                //or maxium nikalenge
                maxi = Math.max(maxi,count);
                //agar 1 ke alava koi or element aya tho count ko 0 kardenge
            }else{
                count = 0;
            }
        }
        return maxi;
    }
}