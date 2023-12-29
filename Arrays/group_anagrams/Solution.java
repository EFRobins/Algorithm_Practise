package Arrays.group_anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
    
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<List<String>, List<String> > group = new HashMap<>();

        for(int i =0; i <strs.length; i++) {
            List<String> l = Arrays.asList(strs[i].split(""));
            java.util.Collections.sort(l);

            List<String> existingList = group.getOrDefault(l, new ArrayList<>());
            existingList.add(strs[i]);
            group.put(l, existingList);
            };
            
            return new ArrayList<>(group.values());
        }
}