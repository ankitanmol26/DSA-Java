//leetcode 27
class Solution {
    public int removeElement(int[] nums, int val) {
        //the k varaible points to the first index of the array which is not equal to val
        //after the for loop finishes the value of k will be the number of elements in the array which are not equal to val
        int k = 0;
       for(int i = 0; i<nums.length; i++){
        //this checks whether the element is equal to the val  
        //if it is not equal to val then it is placed at the k index and k is incremented
            if(nums[i]!=val){
                //if the element is not equal to val then it is placed at the k index and k is incremented
                nums[k]=nums[i];
                k++;
            }
       } 
       return k;
    }
}