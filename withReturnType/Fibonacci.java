package withReturnType;

public class Fibonacci {
	String fib(int n) {
        int a = 0, b = 1;
        String res = a + " " + b + " ";

        for(int i = 2; i < n; i++) {
            int c = a + b;
            res += c + " ";
            a = b;
            b = c;
        }
        return res;
    }
}
