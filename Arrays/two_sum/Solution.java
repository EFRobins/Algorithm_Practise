package Arrays.two_sum;
import java.util.HashMap;
import java.util.Map;

//Solution scored 81.60% in runtime and 8.71% in memory
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // Init pointer
        Map<Integer, Integer> map = new HashMap<>();

        // Loop array once using the containsKey() method to find the compliment inside the HashMap
        for(int i = 0; i < nums.length; i++){

            int compliment = target - nums[i];
            if( map.containsKey(compliment) ){     
                return new int[]{i, map.get(compliment)};
            }

            // Important to store the value and the index so that the index may be returned with map.get() 
            map.put(nums[i], i);

            }
            return null;
        }
}