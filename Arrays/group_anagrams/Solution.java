package Arrays.group_anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// Bottom 22.77% runtime - 14ms, bottom 24.06% memory - 47.52MB. 
public class Solution {
    
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String> > group = new HashMap<>();

        for(int i =0; i <strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if(!group.containsKey(key)){
                group.put(key, new ArrayList<>());
            }

            group.get(key).add(strs[i]);

            };
            
            return new ArrayList<>(group.values());
        }
}
