package switchcase;

public class CharType {
	public static void main(String[] args) {
        char ch = 'd';

        switch(ch) {
            default:
                if(ch >= 'A' && ch <= 'Z')
                    System.out.println("Uppercase");
                else if(ch >= 'a' && ch <= 'z')
                    System.out.println("Lowercase");
                else if(ch >= '0' && ch <= '9')
                    System.out.println("Digit");
        }
    }
}
