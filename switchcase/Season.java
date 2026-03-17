package switchcase;

public class Season {

	public static void main(String[] args) {
        int m = 1;

        switch(m) {
            case 12: case 1: case 2:
                System.out.println("Winter"); break;
            case 3: case 4: case 5:
                System.out.println("Summer"); break;
            case 6: case 7: case 8:
                System.out.println("Monsoon"); break;
        }
    }
}
