public class Concatenation {
    public static void main(String[] args) {
        String firstName = "Shubham";
        String lastName = "Sahu";

        // // Concatenation
        String fullName = firstName + " " + lastName;
        // System.out.println(fullName);

        // // Length
        // System.out.println(fullName.length());

        // // charAt()
        // for (int i = 0; i < fullName.length(); i++) {
        // System.out.println(fullName.charAt(i));
        // }

        // find first index number of character
        System.out.println(fullName.indexOf("S"));

        // find last index number of character
        System.out.println(fullName.lastIndexOf("S"));
    }
}
