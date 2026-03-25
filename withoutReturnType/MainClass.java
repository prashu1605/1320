package withoutReturnType;

public class MainClass {
	public static void main(String[] args) {

        Fibonacci f = new Fibonacci();
        f.fib(10);

        EvenOdd eo = new EvenOdd();
        eo.printSeries(10);

        Reverse r = new Reverse();
        r.reverse(1234);

        Palindrome p = new Palindrome();
        p.check(121);

        Pattern pt = new Pattern();
        pt.printPattern(5);

        Prime pr = new Prime();
        pr.check(7);

        MyInfo info = new MyInfo();
        info.display();
    }
}
