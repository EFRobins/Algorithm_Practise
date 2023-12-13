package Arrays.contains_duplicate;

public class Solution {
    public boolean containsDuplicate(int[] nums) {

        int rightPointer = nums.length;
        for(int i = 0; i < rightPointer; i++) {
            if(nums[i] == rightPointer){return true;}
        }
        return false;
    }

} 
