package Arrays.contains_duplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

// 83.53% 10ms Runtime with 72.22% 55.00MB memory usafge
public class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> count = new HashSet<>();
        for(int num :nums){
            if(count.contains(num)){
                return true;
            } else{
                count.add(num);
            }
        }
        return false;
    }
} 
