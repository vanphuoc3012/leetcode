package hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SparseArrays {

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here
        Map<String, Integer> hashmap = new HashMap<>();
        for(String s : strings) {
            if(hashmap.containsKey(s)) {
                hashmap.put(s, hashmap.get(s) + 1);
            } else {
                hashmap.put(s, 1);
            }
        }
        List<Integer> results = new ArrayList<>(queries.size());
        for(String s : queries) {
            if(hashmap.containsKey(s)) {
                results.add(hashmap.get(s));
            } else {
                results.add(0);
            }
        }

        return results;
    }
}
