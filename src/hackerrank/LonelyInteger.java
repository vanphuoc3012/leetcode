package hackerrank;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LonelyInteger {
    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        Set<Integer> hashset = new HashSet<>();
        for(int i : a) {
            if(hashset.contains(i)) {
                hashset.remove(i);
            } else {
                hashset.add(i);
            }
        }
        return hashset.stream().findFirst().get();
    }
}
