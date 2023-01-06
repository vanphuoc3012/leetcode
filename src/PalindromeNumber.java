public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        String string = String.valueOf(x);
        StringBuffer sb = new StringBuffer();
        for(int i = string.length() - 1; i >= 0; i--) {
            sb.append(string.charAt(i));
        }
        try {
            return x == Integer.valueOf(sb.toString());
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        System.out.println(palindromeNumber.isPalindrome(1234567899));
    }
}
