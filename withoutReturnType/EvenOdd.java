package withoutReturnType;

public class EvenOdd {
	void printSeries(int n) {
        System.out.print("Even: ");
        for(int i = 1; i <= n; i++)
            if(i % 2 == 0) System.out.print(i + " ");

        System.out.print("\nOdd: ");
        for(int i = 1; i <= n; i++)
            if(i % 2 != 0) System.out.print(i + " ");

        System.out.println();
    }
}
