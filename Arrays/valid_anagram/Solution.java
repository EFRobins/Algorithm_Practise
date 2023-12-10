package Arrays.valid_anagram;

import java.util.HashMap;
import java.util.Map;

//Solution scored 38.94% in runtime and 60.95% in memory
// I thought for loops would be slower but a HashMap and lambda functions are instead
class Solution{

    public boolean isAnagram(String s, String t){

        // Cannot be an anagram if the length is different
        if(s.length() != t.length() ){
            return false;
        }
        
        Map<Character, Integer> count = new HashMap<>();

        // Previously implemented using getOrDefault
        s.chars().forEach(ch -> count.merge((char) ch, 1, Integer::sum));
        t.chars().forEach(ch -> count.merge((char) ch, -1, Integer::sum));


        for (int value : count.values()) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }
}