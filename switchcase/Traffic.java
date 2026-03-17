package switchcase;

public class Traffic {

	public static void main(String[] args) {
        String signal = "Red";

        switch(signal) {
            case "Red": System.out.println("Stop"); break;
            case "Yellow": System.out.println("Ready"); break;
            case "Green": System.out.println("Go"); break;
        }
    }
}
