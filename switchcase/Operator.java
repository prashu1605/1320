package switchcase;

public class Operator {

	public static void main(String[] args) {
        int a = 8, b = 2;
        char op = '+';

        switch(op) {
            case '+': System.out.println(a + b); break;
            case '-': System.out.println(a - b); break;
            case '*': System.out.println(a * b); break;
            case '/': System.out.println(a / b); break;
        }
    }
}
