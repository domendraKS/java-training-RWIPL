class YoungerAgeException extends RuntimeException {
    YoungerAgeException(String msg) {
        super(msg);
    }
}

public class ThrowKeyword {
    public static void main(String[] args) {
        int age = 16;
        if (age < 18) {
            throw new YoungerAgeException("You are not eligible for vote");
        } else {
            System.out.println("You can vote successfully");
        }
        System.out.println("Hekllo");
    }
}
