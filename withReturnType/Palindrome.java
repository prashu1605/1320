package withReturnType;

public class Palindrome {
	boolean check(int n) {
        int temp = n, rev = 0;

        while(n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        return temp == rev;
    }
}
