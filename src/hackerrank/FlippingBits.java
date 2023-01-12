package hackerrank;

import java.util.function.LongBinaryOperator;

public class FlippingBits {

    public static long flippingBits(long n) {
        // Write your code here
        String s = Long.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 32 - s.length(); i++) {
            sb.append(1);
        }
        for(char c : s.toCharArray()) {
            if(c == '0') sb.append(1);
            else sb.append(0);
        }
        return Long.parseLong(sb.toString(), 2);
    }

    public static void main(String[] args) {
        long n = 9l;

        String s = Long.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 32 - s.length(); i++) {
            sb.append(1);
        }
        for(char c : s.toCharArray()) {
            if(c == '0') sb.append(1);
            else sb.append(0);
        }
        long l = Long.parseLong(sb.toString(), 2);

    }
}
