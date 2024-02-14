public class Compare {
    public static void main(String[] args) {
        String s1 = "Shubham";
        String s2 = "Sahu";

        // 1. s1 > s2 : +ve value
        // 1. s1 == s2 : 0
        // 1. s1 < s2 : -ve value

        if (s1.compareTo(s2) == 0) {
            System.out.println("String are equal");
        } else {
            System.out.println("String are not equal");
        }
    }
}
