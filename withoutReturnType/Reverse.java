package withoutReturnType;

public class Reverse {
	void reverse(int n) {
        int rev = 0;
        while(n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        System.out.println("Reverse: " + rev);
    }
}
