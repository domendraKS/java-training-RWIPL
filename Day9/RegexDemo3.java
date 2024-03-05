import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo3 {
    public static void main(String[] args) {
        // ---- . = any one character except a line terminator ----
        // String myText = "WelcomeA WelcomeB WelcomeC";
        // Pattern pattern = Pattern.compile("Welcome.");

        // ----- \\d = A digit [0-9] -----
        String myText = "12345ABC";
        Pattern pattern = Pattern.compile("\\d");

        Matcher macher = pattern.matcher(myText);

        while (macher.find()) {
            System.out.println(myText.substring(macher.start(), macher.end()));
        }
    }
}

// ----- \\D = A non-digit [^0-9] -----
// ----- \\s = A whitespace character [\t\n\x0B\f\r] -----
// ----- \\S = A non-whitespace character [^\s] -----
// ----- \\w = A word character [a-zA-Z_0-9] -----
// ----- \\W = A non-word character [^\w] -----