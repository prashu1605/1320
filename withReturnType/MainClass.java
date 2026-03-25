package withReturnType;

public class MainClass {
	
	public static void main(String[] args) {

        Fibonacci f = new Fibonacci();
        System.out.println(f.fib(10));

        EvenOdd eo = new EvenOdd();
        System.out.println(eo.getSeries(10));

        Reverse r = new Reverse();
        System.out.println("Reverse: " + r.reverse(1234));

        Palindrome p = new Palindrome();
        System.out.println(p.check(121));

        Pattern pt = new Pattern();
        System.out.println(pt.getPattern(5));

        Prime pr = new Prime();
        System.out.println(pr.isPrime(7));

        MyInfo info = new MyInfo();
        System.out.println(info.getInfo());
    }
	
}
