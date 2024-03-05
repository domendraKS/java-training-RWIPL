import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {
    public static void main(String[] args) {
        // Pattern pattern = Pattern.compile("Hello");
        Pattern pattern = Pattern.compile("[a-z]");
        Matcher macher = pattern.matcher("5");

        if (macher.matches()) {
            System.out.println("Successfully Matched");
        } else {
            System.out.println("Invalid Input");
        }
    }
}
