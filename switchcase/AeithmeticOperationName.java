package switchcase;

public class AeithmeticOperationName {
	
	public static void main(String[] args) {
        int a = 10, b = 5, op = 1;

        switch(op) {
            case 1: System.out.println(a + b); break;
            case 2: System.out.println(a - b); break;
            case 3: System.out.println(a * b); break;
            case 4: System.out.println(a / b); break;
        }
    }
}
