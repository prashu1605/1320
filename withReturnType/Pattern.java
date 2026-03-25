package withReturnType;

public class Pattern {
	String getPattern(int n) {
        String res = "";
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++)
                res += "* ";
            res += "\n";
        }
        return res;
    }
}
