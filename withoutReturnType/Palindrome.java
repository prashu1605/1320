package withoutReturnType;

public class Palindrome {
	void check(int n) {
        int temp = n, rev = 0;

        while(n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }

        if(temp == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
