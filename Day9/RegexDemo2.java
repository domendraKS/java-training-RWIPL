import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {
    public static void main(String[] args) {
        String myText = "Hello Worlds";
        Pattern pattern = Pattern.compile("[a-z]+");
        Matcher macher = pattern.matcher(myText);

        while (macher.find()) {
            System.out.println(myText.substring(macher.start(), macher.end()));
        }
    }
}
