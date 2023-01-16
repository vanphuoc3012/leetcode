package leetcode;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();

        Map<Character, Character> hashmap1 = new HashMap<>();
        Map<Character, Character> hashmap2 = new HashMap<>();
        for(int i = 0; i < chars1.length; i++) {
            char k1 = chars1[i];
            char k2 = chars2[i];
            if(hashmap1.containsKey(k1)) {
                if(hashmap1.get(k1) != k2) return false;
            } else if (hashmap2.containsKey(k2)){
                if(hashmap2.get(k2) != k1) return false;
            }
            hashmap1.put(k1, k2);
            hashmap2.put(k2, k1);
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "bbbaaaba";
        String t = "aaabbbba";
        System.out.println(isIsomorphic(s, t));
    }
}
