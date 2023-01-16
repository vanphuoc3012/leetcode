package leetcode;

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < s.length()) {
            while(j < t.length()) {
                if(s.charAt(i) == t.charAt(j++)) {
                    count++;
                    break;
                }
            }
            i++;
        }
        return count == s.length();
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }
}
