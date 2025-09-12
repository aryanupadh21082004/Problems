public class Palindrome {
    static int rev2(int n){
        int digits = (int)(Math.log10(n))+1;
        return helper(n ,digits);
    }
    static int helper(int n , int digits){
        if(n%10 == n){
            return n;
        }
        int rem = n%10;
        return rem * (int)Math.pow(10 , digits-1) + helper(n/10 , digits-1);
    }
    static boolean palid(int n){
        return n == rev2(n);
    }

    public static void main(String[] args) {
        int ans = rev2(12321);
        System.out.println(ans);
        System.out.println(palid(1));
    }
}
