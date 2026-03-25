package withReturnType;

public class EvenOdd {
	String getSeries(int n) {
        String even = "", odd = "";

        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0)
                even += i + " ";
            else
                odd += i + " ";
        }
        return "Even: " + even + "\nOdd: " + odd;
    }
}
