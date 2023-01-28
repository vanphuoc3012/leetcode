package leetcode;

public class HappyNumber {

    public static boolean isHappy(int n) {
        int s=0;
        while(n>0){
            int a = n%10;
            s += a*a;;
            n /=10;
        }
        System.out.println(s);
        if(s == 1){
            return true;
        }else if(s == 4){
            return false;
        }
        return isHappy(s);
    }

    public static void main(String[] args) {
        System.out.println(isHappy(7));
    }
}
